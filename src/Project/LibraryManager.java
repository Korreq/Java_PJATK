package Project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class LibraryManager implements ActionListener{
    int elementsPerPage = 5, menuID = 0;
    FileManager[] booksManager = {new FileManager("books.txt"), new FileManager("favourite_books.txt")};
    ArrayList<ArrayList<String>>  books = booksManager[0].dimensionalListFromFile(), favourites = booksManager[1].dimensionalListFromFile(), currentList = books;
    SearchEngine searchEngine = new SearchEngine(books);
    InterfaceBlocks interfaceBlocks = new InterfaceBlocks(elementsPerPage, this);
    JFrame frame = new JFrame("Library Manager");
    JPanel panel = interfaceBlocks.listToMenu(books, favourites);
    JMenuBar menuBar = interfaceBlocks.menuBar();
    LibraryManager(){
        frame.setSize(650, 650);
        frame.setLayout(new GridLayout(1,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.add(panel);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        String s = event.getActionCommand();
        frame.remove(panel);
        switch (s) {
            case ">" -> {
                interfaceBlocks.nextPage();
                panel = interfaceBlocks.listToMenu(currentList, favourites);
            }
            case "<" -> {
                interfaceBlocks.previousPage();
                panel = interfaceBlocks.listToMenu(currentList, favourites);
            }
            case "♡" -> {
                JButton button = (JButton) event.getSource();
                booksManager[1].addToFile(button.getName());
                favourites = booksManager[1].dimensionalListFromFile();
                if(menuID == 1){ currentList = favourites; }
                panel = interfaceBlocks.listToMenu(currentList, favourites);
            }
            case "♥" -> {
                JButton button = (JButton) event.getSource();
                booksManager[1].deleteFromFile(button.getName());
                favourites = booksManager[1].dimensionalListFromFile();
                if(menuID == 1){ currentList = favourites; }
                panel = interfaceBlocks.listToMenu(currentList, favourites);
            }
            case "Delete" -> {
                int tempId = (menuID == 1) ? 1 : 0;
                JButton button = (JButton) event.getSource();
                booksManager[0].deleteFromFile(button.getName());
                booksManager[1].deleteFromFile(button.getName());
                favourites = booksManager[1].dimensionalListFromFile();
                books = booksManager[0].dimensionalListFromFile();
                currentList = booksManager[tempId].dimensionalListFromFile();
                panel = interfaceBlocks.listToMenu(currentList, favourites);
            }
            case "Library", "Cancel" ->{
                if(menuID != 0){
                    menuID = 0;
                    currentList = books;
                    panel = interfaceBlocks.listToMenu(currentList, favourites);
                }
            }
            case "Favourites" -> {
                if(menuID != 1){
                    menuID = 1;
                    currentList = favourites;
                    panel = interfaceBlocks.listToMenu(currentList, favourites);
                }
            }
            case "Add Book" -> {
                if(menuID != 2){
                    menuID = 2;
                    panel = interfaceBlocks.addBookPanel();
                }
            }
            case "\uD83D\uDD0E" -> {
                JTextField textField = (JTextField) menuBar.getComponent(3);
                String keyword = textField.getText();
                if(!Objects.equals(keyword, "")){
                    menuID = 3;
                    currentList = searchEngine.search(keyword);
                    panel = interfaceBlocks.listToMenu(currentList, favourites);
                }
            }
           case "Add" -> {
                if(menuID == 2){
                    JTextField title = (JTextField) panel.getComponent(1), author = (JTextField) panel.getComponent(3), year = (JTextField) panel.getComponent(5);
                    String[] strings = { title.getText(),author.getText(),year.getText() };
                    String lineText;
                    if(!Objects.equals(strings[0], "") && !Objects.equals(strings[1], "")){
                        if(Objects.equals(strings[2], "")){ strings[2] = " "; }
                        lineText = String.join("|", strings);
                        booksManager[0].addToFile(lineText);
                        currentList = booksManager[0].dimensionalListFromFile();
                        panel = interfaceBlocks.listToMenu(currentList,favourites);
                    }
                }
           }
        }
        frame.add(panel);
        frame.setVisible(true);
    }
}
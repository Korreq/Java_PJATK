package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceBlocks{
    private final int elementsPerPage;
    private int currentPage = 1;
    private final ActionListener listener;
    InterfaceBlocks(int elementsPerPage, ActionListener listener){ this.elementsPerPage = elementsPerPage; this.listener = listener; }
    public void nextPage(){ this.currentPage++; }
    public void previousPage(){ if(this.currentPage > 1){ this.currentPage--; } }
    public JMenuBar menuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenuItem main = new JMenuItem("Library");
        JMenuItem favourites = new JMenuItem("Favourites");
        JMenuItem addNew = new JMenuItem("Add Book");
        JTextField text = new JTextField();
        JMenuItem search = new JMenuItem("\uD83D\uDD0E");
        main.addActionListener(listener);
        favourites.addActionListener(listener);
        addNew.addActionListener(listener);
        search.addActionListener(listener);
        menuBar.add(main);
        menuBar.add(favourites);
        menuBar.add(addNew);
        menuBar.add(text);
        menuBar.add(search);
        return menuBar;
    }
    public JPanel addBookPanel(){
        JPanel bookPanel = new JPanel();
        bookPanel.setLayout(new GridLayout(4,2));
        JLabel titleLabel = new JLabel("Title: ");
        JTextField title = new JTextField();
        JLabel authorLabel = new JLabel("Author: ");
        JTextField author = new JTextField();
        JLabel yearLabel = new JLabel("Year: ");
        JTextField year = new JTextField();
        JButton add = new JButton("Add");
        JButton cancel = new JButton("Cancel");
        add.addActionListener(listener);
        cancel.addActionListener(listener);
        bookPanel.add(titleLabel);
        bookPanel.add(title);
        bookPanel.add(authorLabel);
        bookPanel.add(author);
        bookPanel.add(yearLabel);
        bookPanel.add(year);
        bookPanel.add(add);
        bookPanel.add(cancel);
        return bookPanel;
    }
    private JPanel booksPanel(ArrayList<ArrayList<String>> printList, ArrayList<ArrayList<String>> reactList, int startingIndex){
        JPanel books = new JPanel(); JPanel[] panels = new JPanel[elementsPerPage], buttonPanels = new JPanel[elementsPerPage];
        books.setLayout(new BoxLayout(books, BoxLayout.PAGE_AXIS));
        int limit = startingIndex + elementsPerPage, iterator = 0;
        if(startingIndex != 0){ limit--; }
        if(!printList.isEmpty()){
            for(int i = startingIndex; i < limit && i < printList.size(); i++){
                JPanel tempPanel = new JPanel(), tempButtonPanel = new JPanel();
                tempPanel.setLayout(new GridLayout(4,1));
                tempButtonPanel.setLayout(new GridLayout(1,2));
                ArrayList<String> list = printList.get(i);
                JLabel title = new JLabel("Title: " + list.get(0));
                JLabel author = new JLabel("Author: " + list.get(1));
                JLabel year = new JLabel("Year: " + list.get(2));
                JButton action = (!reactList.contains(list)) ? new JButton("♡") : new JButton("♥");
                JButton delete = new JButton("Delete");
                action.setName(String.join("|", list));
                delete.setName(String.join("|", list));
                action.addActionListener(listener);
                delete.addActionListener(listener);
                tempPanel.add(title);
                tempPanel.add(author);
                tempPanel.add(year);
                tempButtonPanel.add(action);
                tempButtonPanel.add(delete);
                buttonPanels[iterator] = tempButtonPanel;
                tempPanel.add(buttonPanels[iterator]);
                panels[iterator] = tempPanel;
                books.add(panels[iterator]);
                iterator++;
            }
        }
        else{ JLabel text = new JLabel("Empty list"); books.add(text); }
        return books;
    }
    private JPanel pagesPanel(int currentPage, int pages){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        JLabel label = new JLabel(currentPage + "/" + pages);
        JButton previous = new JButton("<"), next = new JButton(">");
        previous.addActionListener(listener);
        next.addActionListener(listener);
        panel.add(previous);
        panel.add(label);
        panel.add(next);
        return panel;
    }
    public JPanel listToMenu(ArrayList<ArrayList<String>> printList, ArrayList<ArrayList<String>> reactList){
        JPanel menu = new JPanel(), books, navigation;
        BoxLayout boxLayout = new BoxLayout(menu, BoxLayout.PAGE_AXIS);
        int pages = ((int) Math.ceil((double) printList.size() / elementsPerPage) == 0) ? 1 : (int) Math.ceil((double) printList.size() / elementsPerPage);
        if(currentPage > pages){ currentPage = pages; }
        int startingIndex = (currentPage - 1) * elementsPerPage;
        menu.setLayout(boxLayout);
        books = booksPanel(printList, reactList, startingIndex);
        navigation = pagesPanel(currentPage, pages);
        menu.add(books);
        menu.add(navigation);
        return menu;
    }
}
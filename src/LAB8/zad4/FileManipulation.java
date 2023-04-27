package LAB8.zad4;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManipulation {
    private Path initialDirectory, targetDirectory;
    FileManipulation(String stringInitialDirectory, String stringTargetDirectory){
        this.initialDirectory = Paths.get(stringInitialDirectory); this.targetDirectory = Paths.get(stringTargetDirectory);
    }
    private String kickLetters(String text){
        int letterValue;
        StringBuilder newTextBuilder = new StringBuilder();
        for(char letter : text.toCharArray()){
            letterValue = letter;
            if(letterValue > 96 && letterValue < 123){
                letterValue += 3;
                if(letterValue > 122) letterValue -= 25;
            }
            if(letterValue > 64 && letterValue < 91){
                letterValue += 3;
                if(letterValue > 90) letterValue -= 25;
            }
            newTextBuilder.append((char) letterValue);
        }
        return newTextBuilder.toString();
    }
    private void changeFiles(){
        Path filePath;
        StringBuilder textBuilder;
        String text;
        for(String file : initialDirectory.toFile().list()){
            textBuilder = new StringBuilder();
            filePath = Paths.get(initialDirectory.toAbsolutePath()+"\\"+file);
            try{
                for(String line : Files.readAllLines(filePath)){ textBuilder.append(line); }
                FileWriter writer = new FileWriter(filePath.toFile(), false);
                text = textBuilder.toString().replaceAll(" ","_");
                writer.write(kickLetters(text));
                writer.close();
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
    private void moveFiles(){
        Path filePath, newFilePath;
        for(String file : initialDirectory.toFile().list()){
            filePath = Paths.get(initialDirectory.toAbsolutePath()+"\\"+file);
            newFilePath = Paths.get(targetDirectory.toAbsolutePath()+"\\"+java.time.LocalDate.now()+"_"+file+".out");
            try{
                Files.copy(filePath, newFilePath);
                Files.delete(filePath);
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
    public void moveAndChangeFiles(){
        changeFiles();
        moveFiles();
    }


}

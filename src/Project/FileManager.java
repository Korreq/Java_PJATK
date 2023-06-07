package Project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileManager {
    String fileName, filePath = "src/Project/";
    FileManager(String fileName){ this.fileName = filePath + fileName; }
    private List<String> listFromFile(){
        List<String> stringList;
        try(Stream<String> lines = Files.lines(Paths.get(fileName))){ stringList = lines.collect(Collectors.toList());}
        catch (IOException e){ throw new RuntimeException(e); }
        Collections.sort(stringList);
        return stringList;
    }
    private void listToFile(List<String> list){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for(String line : list){ writer.write(line + System.lineSeparator()); }
        }
        catch (IOException e){ throw new RuntimeException(e); }
    }
    public ArrayList<ArrayList<String>> dimensionalListFromFile(){
        ArrayList<ArrayList<String>> dimensionalList = new ArrayList<>();
        List<String> stringList = listFromFile();
        for (String lines : stringList){ dimensionalList.add( new ArrayList<>(Arrays.asList(lines.split("\\|")))); }
        return dimensionalList;
    }
    public void addToFile(String lineText) {
        String line = lineText + System.lineSeparator();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){ writer.append(line); }
        catch (IOException e){ throw new RuntimeException(e); }
    }
    public void deleteFromFile(String lineText){
        List<String> stringList = listFromFile();
        if(stringList.remove(lineText)){ listToFile(stringList); }
    }
}
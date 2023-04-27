package LAB8.zad1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDir {
    private String catalogName;
    CreateFileDir(String catalogName){
        this.catalogName = catalogName;
    }
    public void create(String name, boolean isDirectory){
        Path path = Paths.get(catalogName+"\\"+name);
        if(!Files.exists(path.getParent())){
            try{ Files.createDirectories(path.getParent()); }
            catch (IOException e){ System.err.println("Failed to create parent directory! " + e.getMessage()); }
        }
        if(isDirectory){
            try{ Files.createDirectories(path); }
            catch (IOException e){ System.err.println("Failed to create directory! " + e.getMessage()); }
        }
        else{
            try{ Files.createFile(path); }
            catch (IOException e){ System.err.println("Failed to create file! " + e.getMessage()); }
        }
    }
}
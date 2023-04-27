package LAB8.zad1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class InformationProvider {
    private Path path;
    InformationProvider(String stringPath){ this.path = Paths.get(stringPath); }
    public void displayInformation(){
        for(String file: path.toFile().list()){
            String message = "";
            Path filePath = Paths.get(path.toAbsolutePath()+"\\"+file);
            System.out.println(file);
            System.out.println(filePath);
            if(!filePath.toFile().exists()) message = "doesn't exists";
            else if (filePath.toFile().isFile()) message = "file";
            else message = "directory";
            System.out.println(message);
        }
    }



}

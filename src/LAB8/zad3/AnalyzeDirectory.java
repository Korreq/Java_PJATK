package LAB8.zad3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalyzeDirectory {
    private Path path;
    AnalyzeDirectory(String stringPath){ this.path = Paths.get(stringPath); }
    public void findBiggestDirectory(){
        String bigestDirectory = "";
        int maxNumberOfFiles = 0, numberOfFiles;
        for(String directory : path.toFile().list()){
            Path directoryPath = Paths.get(path.toAbsolutePath()+"\\"+directory);
            numberOfFiles = 0;
            for(String file : directoryPath.toFile().list()){ numberOfFiles++; }
            if(numberOfFiles > maxNumberOfFiles){ maxNumberOfFiles = numberOfFiles; bigestDirectory = directory; }
        }
        System.out.println("Biggest directory: "+bigestDirectory+", number of files: "+ maxNumberOfFiles);
    }


}

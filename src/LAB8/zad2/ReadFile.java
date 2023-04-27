package LAB8.zad2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    private Path path;
    ReadFile(String stringPath){
        this.path = Paths.get(stringPath);
    }
    public int sumOfEvenLines(){
        int sum = 0, iterator = 1;
        try{
            for(String line : Files.readAllLines(path)){
                if (iterator % 2 == 0) sum += Integer.parseInt(line);
                iterator++;
            }
        }
        catch (IOException e){ System.out.println("Failed to read from file " + e.getMessage()); }
        return sum;
    }
}

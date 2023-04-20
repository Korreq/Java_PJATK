package LAB7.zad4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Statistics {
    private String text = "";
    private final Pattern letters = Pattern.compile("[A-Z|ĄĆĘŁŃÓŚŹŻ]");
    private final Pattern vowels = Pattern.compile("[AEIOUÓYĄĘ]", Pattern.CASE_INSENSITIVE);
    private final Pattern consonants = Pattern.compile("[A-Z|ĆŁŃŚŹŻ&&[^AEIOUÓYĄĘ]]", Pattern.CASE_INSENSITIVE);
    private final Pattern whiteChars = Pattern.compile("\\s");
    private final Pattern numbers = Pattern.compile("\\d");
    private final Pattern otherChars = Pattern.compile("[[^A-Z]&&\\D&&\\S]");
    private int countMatches(Pattern pattern){
        Matcher countPatternMatches = pattern.matcher(text.toUpperCase());
        int count = 0;
        while(countPatternMatches.find()){ count++; }
        return count;
    }
    public Statistics(String text){ this.text = text; }
    @Override
    public String toString(){
        return
                String.format("Podany tekst %s zawiera:\n", text) +
                String.format("%d liter, w tym %d samogłosek oraz %d spółgłosek\n", countMatches(letters), countMatches(vowels), countMatches(consonants)) +
                String.format("%d białych znaków\n", countMatches(whiteChars)) +
                String.format("%d liczb\n", countMatches(numbers)) +
                String.format("%d innych znaków\n", countMatches(otherChars));
    }


}

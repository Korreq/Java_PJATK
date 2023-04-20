package LAB7.zad6;

public class StringTransform {
    public String replaceChars(String text, Character character){
        return text.replaceAll(character.pattern,"");
    }
    public String replaceChars(String text, Character character, String replacement){
        return text.replaceAll(character.pattern,"\\"+replacement);
    }
    public String leaveOnlyChars(String text, Character character){
        return text.replaceAll("[^"+character.pattern+"]","");
    }
}

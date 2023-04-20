package LAB7.zad6;

public enum Character {
    VOWEL("[AEIOUÓYĄĘaeiouóyąę]"), CONSONANT("[A-Za-z|ĆŁŃŚŹŻćłńśźż&&[^AEIOUÓYĄĘaeiouóyąę]]"), SPACE("\\s"), NUMBER("\\d"), SPECIAL_CHAR("[\\W&&\\S]");
    public final String pattern;
    private Character(String pattern){
        this.pattern = pattern;
    }
}

package LAB5.zad4;

public class ManyArguments {
    int anInt;
    double aDouble;
    String aString;
    char aChar;
    boolean aBoolean;
    ManyArguments(int anInt, double aDouble, String aString, char aChar, boolean aBoolean){
        this.anInt = anInt; this.aDouble = aDouble; this.aString = aString; this.aChar = aChar; this.aBoolean = aBoolean;
    }
    @Override
    public String toString(){
        return this.anInt + ", " + this.aDouble + ", " + this.aString + ", " + this.aChar + ", " + this.aBoolean;
    }
}

package LAB7.zad6;

public class Zad6 {
    public static void main(String[] args) {
        String text = "123Te#@$$2%    st";
        StringTransform stringTransform = new StringTransform();
        System.out.println(stringTransform.replaceChars(text,Character.NUMBER));
        System.out.println(stringTransform.replaceChars(text,Character.NUMBER,"$"));
        System.out.println(stringTransform.leaveOnlyChars(text, Character.NUMBER));
    }
}

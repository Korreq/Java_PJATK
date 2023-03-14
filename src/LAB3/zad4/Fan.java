package LAB3.zad4;

public class Fan {
    public enum Mode {
        LOW(1), MEDIUM(2), HIGH(3), OFF(0);
        private int value;
        Mode(int value){ this.value = value; }
        public int getValue(){ return value; }
    }
    Mode mode;
    int radius;
    String color;
    public Fan(){
        mode = Mode.OFF;
        radius = 5;
        color = "White";
    }
    public Fan(Mode mode, int radius, String color){
        this.mode = mode;
        this.radius = radius;
        this.color = color;
    }
    public void desc(){
        System.out.println("Tryb wiatraka: "+ mode);
        System.out.print("Prędkość : ");
        System.out.printf("%.2f",(Math.PI * radius * mode.getValue() * 180) / 60 );
        System.out.println("cm/s\nPromień: " + radius);
        System.out.println("Kolor: " + color);
    }
}

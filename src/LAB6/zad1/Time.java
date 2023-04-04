package LAB6.zad1;

import java.util.Arrays;

public enum Time {
    DAY(1),MONTH(30),YEAR(365);
    private final int time;
    Time(int time) { this.time = time; }
    public static int getTime(String duration){
        Time[] time = Time.values();
        System.out.println(Arrays.toString(time));
        String[] stringTime = new String[time.length];
        for( int i = 0; i < stringTime.length; i++){
            stringTime[i] = time[i].toString();
        }
        int index = Arrays.asList(stringTime).lastIndexOf(duration.toUpperCase());
        return time[index].time;
    }
}

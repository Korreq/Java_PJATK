package LAB8.zad6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculateDate {
    private LocalDate date = LocalDate.now();
    private LocalDateTime localDateTime;
    CalculateDate(int hours, int minutes){
        localDateTime = date.atTime(hours, minutes);
    }
    public void showDateInDifferentTimeZone(int change){
        LocalDateTime newDateTime = localDateTime;
        newDateTime = newDateTime.plusHours(change);
        System.out.println(newDateTime);
    }


}

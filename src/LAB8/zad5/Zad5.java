package LAB8.zad5;

import java.time.LocalDate;

public class Zad5 {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear(), leapYears = 0;
        LocalDate year;
        for(int i = currentYear; leapYears < 101; i++){
            year = LocalDate.ofYearDay(i,1);
            if(year.isLeapYear()){ System.out.println(i); }
            leapYears++;
        }
    }
}

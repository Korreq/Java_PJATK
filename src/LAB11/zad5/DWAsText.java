package LAB11.zad5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DWAsText {
    public static Date getDateFromString(String text){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy");
        Date date;
        try { date = simpleDateFormat.parse(text); }
        catch (ParseException e){ return null; }
        return date;
    }
    public static String getDayText(Date date){
        DateFormat format = new SimpleDateFormat("EEEE");
        return format.format(date);
    }
}

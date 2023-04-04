package LAB6.zad3;

public class CustomDate {
    private int day, month, year;
    CustomDate(int day, int month, int year){
        this.day = day; this.month = month; this.year = year;
    }
    @Override
    public String toString(){
        String monthString = "";
        if(day > 31 || day < 1) day = 1;
        if(month > 12 || month < 1) month = 1;
        if(year < 0) year = 1;
        switch (month){
            case 1 -> monthString = "jan";
            case 2 -> monthString = "feb";
            case 3 -> monthString = "mar";
            case 4 -> monthString = "apr";
            case 5 -> monthString = "may";
            case 6 -> monthString = "june";
            case 7 -> monthString = "july";
            case 8 -> monthString = "aug";
            case 9 -> monthString = "sept";
            case 10 -> monthString = "oct";
            case 11 -> monthString = "nov";
            case 12 -> monthString = "dec"; }
        //return day + "." + month + "." + year;
        //return ((day < 10)? "0" + day : day) + "." + ((month < 10)? "0" + month : month) + "." + year;
        return day + " " + monthString + " " + year;
    }
}

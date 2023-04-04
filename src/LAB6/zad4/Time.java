package LAB6.zad4;

public class Time {
    private int hours, minutes;
    Time(int hours, int minutes){ this.hours = hours; this.minutes = minutes; }

    public Time addSubtractTime(Time t, boolean isAdding){
        int time1 = minutes + (hours * 60), time2 = t.minutes + (t.hours * 60), time3;
        if(isAdding) time3 = time1 + time2;
        else time3 = time1 - time2;
        return new Time(time3/60, time3%60);
    }
    public Time multiplyTime(int multiplier){
        int time1 = (minutes + (hours * 60)) * multiplier;
        return new Time(time1/60, time1%60);
    }
    @Override
    public String toString(){
        hours += minutes/60;
        minutes %= 60;
        return hours + "h " + minutes + "min";
    }
}

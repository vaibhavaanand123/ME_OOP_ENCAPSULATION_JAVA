package pl_java.exercise_1;

public class CustomTime {

    final static int Max_Hour=23;
    final static int Max_Min_sec=59;

    private int hour; // current hour in military time
    private int minute; // current minute in military time
    private int second; // current second in military time

    // return the time to the calling method in a three-membered array
    // Setter
    // default constructor

    public CustomTime(){
        hour=0;
        minute=0;
        second=0;
    }

    // parameterized constructor

    public CustomTime(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    private void setHour(int hour) {
        if(hour>=0 && hour<=Max_Hour){
        this.hour = hour;
        }
        else{
            System.out.println("Invalid Hours Enter, Restricted B/W 0 to 23");
            this.hour=0;
        }
    }

    private void setMinute(int minute) {
        if(minute>=0 && minute<=Max_Min_sec){
        this.minute = minute;
        }
        else{
            System.out.println("Invalid Minutes Enter, Restricted B/W 0 to 59");
            this.minute=0;
        }
    }

    private void setSecond(int second) {
        if(second>=0 && second<=Max_Min_sec){
        this.second = second;
    }
    else{
        System.out.println("Invalid Minutes Enter, Restricted B/W 0 to 59");
        this.second=0;
    }
    }

    // Getter

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    int[] getTime() {
        return new int[] { hour, minute, second };
    }

    // increment the current time by one second
    void incrementTime() {
        second=++second%(Max_Min_sec+1);
        if(second==0){
            minute=++minute%(Max_Min_sec+1);
        }
        if(second==0 && minute==0){
            hour=++hour%(Max_Hour+1);
        }
    }
}

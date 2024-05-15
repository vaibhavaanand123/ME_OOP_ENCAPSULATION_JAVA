package pl_java.exercise_1;

public class CustomTime {

    private int hour; // current hour in military time
    private int minute; // current minute in military time
    private int second; // current second in military time

    // return the time to the calling method in a three-membered array
    // Setter

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
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
        ++second;
    }
}

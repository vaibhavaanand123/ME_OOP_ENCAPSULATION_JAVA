package pl_java.exercise_1;

public class CustomTime{

    int hour;   // current hour in military time
    int minute; // current minute in military time
    int second; // current second in military time
  
    // return the time to the calling method in a three-membered array
    int[] getTime(){
        return new int[] {hour, minute, second};
    }

    // increment the current time by one second  
    void incrementTime(){
        ++second;
    }
}

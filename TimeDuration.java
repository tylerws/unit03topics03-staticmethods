import javax.swing.event.MouseInputListener;
import java.util.Scanner;

public class TimeDuration {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeDuration(int timeHours, int timeMinutes, int timeSeconds) {
        hours = timeHours;
        minutes = timeMinutes;
        seconds = timeSeconds;
    }
    
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    
    public String toString() {
        String colonForm = "";
        if (hours == 0) {
            colonForm = colonForm + 00 + ":";
        } else if (hours < 10) {
            colonForm = colonForm + 0 + hours + ":";
        } else {
            colonForm = colonForm + hours;
        }
        if (minutes == 0) {
            colonForm = colonForm + 00 + ":";
        } else if (minutes < 10) {
            colonForm = colonForm + 0 + minutes + ":";
        } else {
            colonForm = colonForm + minutes + ":";
        }
        if (seconds == 0) {
            colonForm = colonForm + 00;
        } else if (seconds < 10) {
            colonForm = colonForm + 0 + seconds;
        } else {
            colonForm = colonForm + seconds;
        }
        return colonForm;
    }

    
    
    public static TimeDuration parseFromString(String s) {
        
        
        
        String hourString = s.substring(0, 2);
        int hours = Integer.parseInt(hourString);
        System.out.println("got " + hours + " hours");

        String minuteString = s.substring(3, 5);
        int minutes = Integer.parseInt(minuteString);
        
        String secondString = s.substring(6, 8);
        int seconds = Integer.parseInt(secondString);
        
        return new TimeDuration(hours, minutes, seconds);


    }

public static void main(String[] args) {
    TimeDuration td1 = parseFromString("05:06:09");
    System.out.println(td1);
}
}

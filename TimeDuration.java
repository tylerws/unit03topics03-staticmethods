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

    private static boolean stringIsNumber(String s) {
        if (s.equals("0") || 
        s.equals("1") ||
        s.equals("2") ||
        s.equals("3") ||
        s.equals("4") ||
        s.equals("5") ||
        s.equals("6") ||
        s.equals("7") ||
        s.equals("8") ||
        s.equals("9")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static TimeDuration parseFromString(String s) {
        
        if (stringIsNumber(s.substring(0,2)) == true )
        
        String hourString = s.substring(0, 2);
        int hours = Integer.parseInt(hourString);
        System.out.println("got " + hours + " hours");

        String minuteString = s.substring(3, 5);
        int minutes = Integer.parseInt(minuteString);
        System.out.println("got " + minutes + " minutes");
        
        String secondString = s.substring(6, 8);
        int seconds = Integer.parseInt(secondString);
        System.out.println("got " + seconds + " seconds");
        
        return new TimeDuration(hours, minutes, seconds);


    }
      
    public boolean equals(Object otherObj) {
    if (this == otherObj) {
        return true;
        }

    if (otherObj == null) {
        return false;
    }
    
    if (this.getClass() != otherObj.getClass()) {
        return false;
    }
    
    TimeDuration other = (TimeDuration) otherObj;

    if (this.hours == other.hours &&
       this.minutes == other.minutes &&
       this.seconds == other.seconds) {
            return true;
    } else {
        return false;
    }
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

    
    
    

public static void main(String[] args) {
    TimeDuration td1 = parseFromString("05:06:09");
    System.out.println(td1);
}
}

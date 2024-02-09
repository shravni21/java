package Date_and_Time_API;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // for mili seconds start-> 1 jan 1970

        long milis = System.currentTimeMillis();
        long seconds = milis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long day = hours / 24;
        long year = day / 365;
        // System.out.println("Mili-Seconds " + milis);
        // System.out.println("Seconds: " + seconds);
        // System.out.println("Minutes: " + minutes);
        // System.out.println("Hours: " + hours);
        // System.out.println("Year: " + year);

        // Date Class
        Date d = new Date();
        // System.out.println(d);
        // System.out.println(System.currentTimeMillis());

        // get day
        Date d1 = new Date("7/26/2020");
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear() + 1900);
        System.out.println(d.getYear() + 1900);

    }
}

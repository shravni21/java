package Date_and_Time_API;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender_time {
    public static void main(String[] args) {

        // ------------ Calender Class --------------------
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        // get method
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.JANUARY);

        // Gregorian calender is mutable

        // -------------- TimeZone -------------------------
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

    }
}

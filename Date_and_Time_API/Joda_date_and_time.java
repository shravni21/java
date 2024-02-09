package Date_and_Time_API;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Joda_date_and_time {
    public static void main(String[] args) {

        // Old Class
        Date D = new Date();
        D.setHours(15);
        System.out.println(D);

        LocalDate dt = LocalDate.now();
        // System.out.println(dt);

        // Can create date using zone id
        LocalDate dt1 = LocalDate.now(ZoneId.of("US/Mountain"));
        System.out.println(dt1);

        LocalDate dt2 = LocalDate.parse("2024-01-03");
        LocalDate dt3 = dt2.plusMonths(6);
        System.out.println(dt3);

        // +- time and date values
    }
}

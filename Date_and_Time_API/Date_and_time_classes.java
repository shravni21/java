package Date_and_Time_API;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Date_and_time_classes {
    public static void main(String[] args) {

        // ---------Zone date and time---------
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        // -------- Offset date and time-----------
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        // --------- Offset time----------------
        OffsetTime ot = OffsetTime.now();
        System.out.println(ot);

        // -------------- Zoned date and time of another zone---------
        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("US/Mountain"));
        System.out.println(zdt1);

        // ----------Month-Day--------------
        MonthDay md = MonthDay.now();

        // get day of the month
        System.out.println(md.getDayOfMonth());

        // get current month
        System.out.println(md.getMonth());

        // ----------- Year month --------------
        YearMonth ym = YearMonth.now();

        // Get Month, year
        System.out.println(ym.getYear());
        System.out.println(ym.getMonth());

        // ------------- Period -----------
        Period p = Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));

    }
}

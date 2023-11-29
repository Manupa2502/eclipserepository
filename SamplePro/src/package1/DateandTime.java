package package1;
import java.text.DateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//*import javax.swing.text.DateFormatter;

public class DateandTime {
    //LocalDate.now() is used to get the current date
    //LocalTime.now() is used to get the  current time
    //LocalDateTime.now() is used to get both date and time
    //LocalDate.of() is used for the formated date of all the dates
    //LocalTime.of() is used for the formated time of all the times 
    //DateTimeFormatter.ofPattern("dd-MM-yyyy") is used for formatting the date for required form
    //   MMM = month
    //   yyyy = year
    //   dd   =day
    //
    //modify date to future or past date
    // LocalDate().of().plusDays() adding days to date
    // LocalDate().of().plusWeeks() adding weeks to date
    // LocalDate().of().plusMonths() adding maonths to date
    // LocalDate().of().plusYears() adding years to date
    // LocalDate().of().minusDays() subtracting days to date
    // LocalDate().of().minusWeeks() subtracting weeks to date
    // LocalDate().of().minusYears() subtracting years to date
    // LocalDate().of().minusMonths() subtracting months to date
    //modify time to future or past time
    // LocalTime().of().plusMinutes() adding minutes to time
    // LocalTime().of().plusHours() adding hours to time
    // LocalTime().of().plusSeconds() adding seconds to time
    // LocalTime().of().plusNanos() adding nanoseconds to time
    // LocalTime().of().minusHours() subtracting hours to time
    // LocalTime().of().minusMinutes() subtracting minutes to time
    // LocalTime().of().minusSeconds() subtracting seconds to time
    // LocalTime().of().minusNanos() subtracting nanoseconds to time
 

    public static void main(String[] args) {
        //getting current date and time
        LocalDate d1=LocalDate.now();
        LocalTime t1=LocalTime.now();
        LocalDateTime dt1=LocalDateTime.now();
        System.out.println(d1);
        System.out.println(t1);
        System.out.println(dt1);
        d1=LocalDate.of(2023, 01, 01);
        System.out.println(d1);
        //to get in time format
        t1=LocalTime.of(20, 18, 30);
        System.out.println(t1);
        //getting the date with modified month
        var d2=LocalDate.of(2023,Month.DECEMBER,01);
        System.out.println(d2);
        //date formatter
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(d2.format(f));

        //getting feature and past date and time
        //adding days
        d1=LocalDate.of(2023,12,10).plusDays(20);
        System.out.println(d1);
        //adding weeks
        d1=LocalDate.of(2023,12,10).plusWeeks(20);
        System.out.println(d1);
        //adding years
        d1=LocalDate.of(2023,12,10).plusYears(20);
        System.out.println(d1);
        //adding months
        d1=LocalDate.of(2023,12,10).plusMonths(2);
         System.out.println(d1);
         //subtracting days
        d1=LocalDate.of(2023,12,10).minusDays(20);
        System.out.println(d1);
        //subtracting weeks
        d1=LocalDate.of(2023,12,10).minusWeeks(20);
        System.out.println(d1);
        //subtracting months
        d1=LocalDate.of(2023,12,10).minusMonths(20);
        System.out.println(d1);
        //subtracting years
        d1=LocalDate.of(2023,12,10).minusYears(20);
        System.out.println(d1);

        //adding hours
        t1=LocalTime.of(0,0,0).plusHours(2);
        System.out.println(t1);
        //adding minutes
        t1=LocalTime.of(0,0,0).plusMinutes(60);
        System.out.println(t1);
        //adding secs
        t1=LocalTime.of(0,0,0).plusSeconds(60);
        System.out.println(t1);
        //adding nanosecs
        t1=LocalTime.of(0,0,0).plusNanos(60);
        System.out.println(t1);

        //subtracting hours
        t1=LocalTime.of(0,0,0).minusHours(2);
        System.out.println(t1);
        //subtracting minutes
        t1=LocalTime.of(0,0,0).minusMinutes(60);
        System.out.println(t1);
        //subtracting secs
        t1=LocalTime.of(0,0,0).minusSeconds(60);
        System.out.println(t1);
        //subtracting nanosecs
        t1=LocalTime.of(0,0,0).minusNanos(60);
        System.out.println(t1);


    }
    
}

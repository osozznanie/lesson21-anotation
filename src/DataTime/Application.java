package DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static DataTime.DateConverter.*;


public class Application {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = convToLocalDate(date);
        System.out.println(localDate);

        LocalTime localTime = convToLocalTime(date);
        System.out.println(localTime);

        LocalDateTime localDateTime = convToLocalDateTime(date);
        System.out.println(localDateTime);
    }
}


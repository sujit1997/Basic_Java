package Chapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SM100_java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime e = LocalTime.now();
        System.out.println(e);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}

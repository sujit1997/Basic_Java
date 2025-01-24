package Chapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SM101_DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();//THis is date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy--E H:m a");// This is format
        String mytime = dt.format(df);// Creating date format
        System.out.println(mytime);

        DateTimeFormatter dm = DateTimeFormatter.ISO_DATE_TIME;
        String mytime2 = dt.format(dm);
        System.out.println(mytime2);
    }
}

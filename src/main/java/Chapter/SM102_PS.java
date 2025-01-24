package Chapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SM102_PS {
    public static void main(String[] args) {
        // Q1
        ArrayList ar = new ArrayList();
        ar.add("Sujit");
        ar.add("AJIT");
        ar.add("Lokesh");
        ar.add("shubham");
        ar.add("Suraj");
        ar.add("anil");
        ar.add("ankit");
        ar.add("komal");
        for (Object o:ar){
            System.out.println(o);
        }

        // Question 2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //Question 3
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.get(Calendar.HOUR) +":"+(Calendar.MINUTE)+":"+(Calendar.SECOND));

        //Question 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String mydate = dt.format(df);
        System.out.println(mydate);

        // Question 5
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(9);
        s.add(5);
        s.add(7);
        s.add(8);
        System.out.println(s);
    }
}

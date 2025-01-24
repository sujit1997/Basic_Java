package Chapter;
import java.util.*;
public class SM91_arraylist {
    public static void main(String[] args) {
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<Integer> l2 = new ArrayList<>(5);
    l2.add(15);
    l2.add(49);
    l2.add(41);
    l1.add(6);
    l1.add(5);
    l1.add(0,7);
    l1.add(8);
    l1.add(6);
    l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(159));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,566);
        // l1.clear();
    for(int i=0;i<l1.size();i++){
       System.out.print(l1.get(i));
        System.out.print(",");
        }
    }
}

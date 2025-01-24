package Chapter;

import java.util.LinkedList;

public class SM92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);

        l1.addLast(2545);
        l1.addFirst(25);
        System.out.println(l1.indexOf(6));
        System.out.println(l1.contains(8));
        System.out.println(l1.lastIndexOf(8));
        for(int i=0;i<=l1.size()-1;i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}

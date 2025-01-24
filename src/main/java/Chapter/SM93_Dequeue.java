package Chapter;

import java.util.ArrayDeque;

public class SM93_Dequeue {
    public static void main(String[] args) {
        ArrayDeque <Integer> DQ1 = new ArrayDeque<>();
        DQ1.add(5);
        DQ1.add(6);
        DQ1.add(56);
        DQ1.addFirst(564);
        DQ1.addLast(745);
        System.out.println(DQ1.getFirst());
        System.out.println(DQ1.getLast());

    }
}

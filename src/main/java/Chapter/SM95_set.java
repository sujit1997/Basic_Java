package Chapter;

import java.util.HashSet;

public class SM95_set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(5);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
        myHashSet.clear();
        System.out.println(myHashSet);

    }
}

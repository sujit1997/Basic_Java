package Chapter;

import java.util.ArrayList;
class mygeneric<T1>{
    int val;
    private  T1 t1;

    public mygeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class SM110_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
       // arrayList.add("Str1");
        arrayList.add(5);
        arrayList.add(6);
        int a = arrayList.get(1);
       // System.out.println(a);
        mygeneric<String> g1=new mygeneric(23,"Mystring");
        String str = g1.getT1();
        System.out.println(str);

    }
}

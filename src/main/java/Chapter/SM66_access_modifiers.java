package Chapter;
class c1{
    public int x = 5;
    protected int y =45;
     int z = 89;
    private int a = 90;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
       }
}
public class SM66_access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);

    }
}

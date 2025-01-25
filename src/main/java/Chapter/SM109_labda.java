package Chapter;
interface DemoAno2{
    void meth1(int a);
}
//class sujitfunc implements DemoAno2{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}
public class SM109_labda {
    public static void main(String[] args) {

        // LAMBDA Expression
//        sujitfunc obj = new sujitfunc();
//        obj.meth1();
        DemoAno2 obj = (a)->{
            System.out.println("I am method 1 : " + a);
        };
        DemoAno2 obj1 = obj;
        obj1.meth1(6);
    }
}

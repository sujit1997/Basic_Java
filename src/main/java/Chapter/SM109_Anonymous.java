package Chapter;
interface DemoAno{
    void meth();
    void meth2();
        }
//class anonyDemo implements DemoAno {
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth() {
//        System.out.println("I am meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}
public class SM109_Anonymous {
        public static void main(String[] args) {
//    anonyDemo obj = new anonyDemo();
//    obj.meth();
            DemoAno obj = new DemoAno() {
                @Override
                public void meth() {
                    System.out.println("I am meth1");
                }

                @Override
                public void meth2() {
                    System.out.println("I am meth1");
                }
            };
            obj.meth();
    }
}

package Chapter;
class A {
    public int sujit() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am meth 2 of class B");
    }
    public void meth3(){
        System.out.println("I am Meth 3 of class B");
    }
}
public class SM48_method_overriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}

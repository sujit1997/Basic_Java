package Chapter;
 abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base 2 ka constructor hu");
    }
    public void satHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2{
     @Override
     public void greet(){
         System.out.println("good morning");
     }
     @Override
     public void greet2(){
         System.out.println("good afternoon");
     }
}
 abstract class child3 extends Parent2{
     public void th(){
         System.out.println("I am good");
     }
}
public class SM53_abstract {
    public static void main(String[] args) {
       // Parent2 p = new Parent2(); // Throw error cause its abstract class
       child2 c = new child2();
       // child3 c = new child3(); // Throw error cause its abstract class

    }

}

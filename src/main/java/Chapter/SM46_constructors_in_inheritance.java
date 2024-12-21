package Chapter;

class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int x){
        System.out.println("I am an overloaded constructor with value : "+ x);
    }

}
class derived1 extends base1 {
    derived1(){
        // super(0); // use a constructor which has integer
        System.out.println("I am also constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of y as : " +y);
    }
}
class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derived with value of z as : " +z);
    }
}

public class SM46_constructors_in_inheritance {
    public static void main(String[] args) {
        //base1 b = new base1();
        //derived1 d = new derived1();
        //derived1 d = new derived1(5,6);
        childOfDerived cd = new childOfDerived(12,13,14);
    }
}

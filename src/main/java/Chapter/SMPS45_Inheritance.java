package Chapter;
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void sentance(){
        System.out.println("This is constructor ");
    }
}

class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class SMPS45_Inheritance {
    public static void main(String[] args) {
        // Creating object of base class
        base a = new base();
        a.setX(10);
        System.out.println(a.getX());

        // Creating an object  of derived class
        Derived b = new Derived();
        b.setX(9);
        System.out.println(b.getX());

    }
}

package Chapter;
class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v){
        this.a= v;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class SMPS47_thisSuper {
    public static void main(String[] args) {
    Ekclass e = new Ekclass(5);
    DoClass d = new DoClass(5);
    System.out.println(e.getA());

    }
}

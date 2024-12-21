package Chapter;

interface Bicycle{
    int a =45;
    void applyBreak (int decrement);
    void speedUp (int increment);
}

interface HornBicycle{

    void blowHornK3g ();
    void blowHornMHN ();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn() {
        System.out.println("Pi pi po po");
    }
        public void applyBreak(int decrement){
            System.out.println("Applying break");
        }
        public void speedUp(int increment){
            System.out.println("Applying SpeedUp");
        }
        public void blowHornK3g(){
            System.out.println("Kabhi khushi kabhi gum pe pe pe");
        }
        public void blowHornMHN(){
            System.out.println("Mai hoo na po po po");
        }
}

public class SM54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleSujit = new AvonCycle();
        // You can create properties in interfaces
        cycleSujit.applyBreak(1);
        // you can create properties in Interface
        System.out.println(cycleSujit.a);
        // You can not modifiedthe properties in interfaces as they are final
        // cycleSujit.a = 454;
        //System.out.println(cycleSujit.a);

        cycleSujit.blowHornK3g();
        cycleSujit.blowHornMHN();
    }
}

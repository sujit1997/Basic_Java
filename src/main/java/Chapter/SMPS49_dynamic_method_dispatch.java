package Chapter;
class phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class smartphone extends phone{

        public void on(){
            System.out.println("Turning on Smartphone");
        }
        public void music(){
            System.out.println("Playing music");
        }
}
public class SMPS49_dynamic_method_dispatch {
    public static void main(String[] args) {
    // phone obj = new phone(); //Allowed
    // smartphone smobj = new smartphone();//Allowed
    //obj.name();
    phone obj = new smartphone();// yes it is allowed
         obj.showTime();
         obj.on();
         // obj.music(); // not allowed
        // smartphone obj2 = new phone() // Not allowed
    }
}

package Chapter;
interface myCamera2{
    void takeSnap();
    void recordVideo();
    private void greeting(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greeting();
        System.out.println("Recording in 4k...");
    }
}
interface myWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Callindg" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.." );
    }

}
class mySmartPhone2 extends myCellPhone2 implements myWifi2,myCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    // public void record4kVideo(){
    //   System.out.println("Taking snap and recording in 4K");
    //}
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList ={"sujit","prashant","naman"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);  }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class SM59_Polymorphism {
    public static void main(String[] args) {
        myCamera2 cam1 = new mySmartPhone2(); // This is a smartphone but, use as a camera
        // cam1.getNetworks(); not allowed
        // cam1.sampleMeth(); not allowed
        cam1.record4kVideo();
        mySmartPhone2 s = new mySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(65749);
    }
}

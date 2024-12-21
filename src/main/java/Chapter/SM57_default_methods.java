package Chapter;
interface myCamera{
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
interface myWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Callindg" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.." );
    }

}
class mySmartPhone extends myCellPhone implements myWifi,myCamera{
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
        System.out.println("Connecting to "+ network);
    }
}
public class SM57_default_methods {
    public static void main(String[] args) {
    mySmartPhone ms = new mySmartPhone();
    // ms.greet(); // Throws an error
    ms.record4kVideo();
    String[] ar = ms.getNetworks();
    for(String item : ar){
        System.out.println(item);
    }
    }
}

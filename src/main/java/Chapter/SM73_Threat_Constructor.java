package Chapter;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
        // while(true){
        //    System.out.println("I am a Thread");
        //}
    }
}
public class SM73_Threat_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("sujit");
        MyThr t2 = new MyThr("ram candr");
    t1.start();
        t2.start();
        System.out.println("The id of the thred t is " +t1.getId());
        System.out.println("The name of the thread t is " +t1.getName());
        System.out.println("The id of the thred t is " +t2.getId());
        System.out.println("The name of the thread t is " +t2.getName());
    }
}

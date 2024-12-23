package Chapter;
// Interrupt method used here
class MyNewThr3 extends Thread{
    public void run(){
        int i=0;
        while(true){
            // System.out.println("I am a thread");
            System.out.println("Thank you : ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyNewThr4 extends Thread{

    public void run(){
        while(true){
            // System.out.println("I am a thread");
            System.out.println("My  Thank you : ");
        }
    }
}
public class SM75a_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr3 t1 = new MyNewThr3();
        MyNewThr4 t2 = new MyNewThr4();
        t1.start();
        //try{
        //    t1.join();
        //} catch(Exception e){
        //    System.out.println(e);
        //}

        t2.start();

    }
}

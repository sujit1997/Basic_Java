package Chapter;

class myThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread2 for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class SM70_ {
    public static void main(String[] args) {
    myThread1 t1 = new myThread1();
    myThread2 t2 = new myThread2();
    t1.start();
    t2.start();
    }
}

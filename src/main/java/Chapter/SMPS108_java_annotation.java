package Chapter;
@FunctionalInterface
interface myfunctionalInterface {
    void thismethod();
}
class NewPhone extends phone {
    @Override
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public int sum(int a, int b){
    return a+b;
    }
}
public class SMPS108_java_annotation {
    @SuppressWarnings("Deprication")
    public static void main(String[] args) {
    NewPhone phone = new NewPhone();
    phone.showTime();
    phone.sum(5,6);
    }
}

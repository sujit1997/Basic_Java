package Chapter;

public class SMPS85_finally {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("This is an end of function");
        }
        return 0;
    }
    public static void main(String[] args) {
     int k = greet();
        System.out.println(k);
        int c= 7;
        int d = 9;
        while(true){
            try{
                System.out.println(c/d);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Iam finally for value of b = " + d);
            }
            d--;
        }

        try{
            System.out.println(50/10);
        }
        finally {
            System.out.println("yes this is finally");
        }
    }
}

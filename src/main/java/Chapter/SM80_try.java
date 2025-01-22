package Chapter;

public class SM80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        //without try
        //    int c = a/b;
       // System.out.println("The result is " +c );
         //With try
        try{
            int c = a/b;
           System.out.println("THe result is " +c);
        }
        catch (Exception e){
           System.out.println("We fail too divide");
           System.out.println(e);
        }
        System.out.println("end of the program");


    }
}

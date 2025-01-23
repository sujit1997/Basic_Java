package Chapter;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return  "I am toString()";
    }

    @Override
    public String getMessage() {
        return  "I am get Message() ";
    }
}
// new Exception
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return  "age can not be greater than 125";
    }

    @Override
    public String getMessage() {
        return  "make sure the value of age entered be correct ";
    }
}
public class SM83_exception_class {
    public static void main(String[] args) {
    int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
    if(a<9){
        try{
           // throw new MyException();
            throw new ArithmeticException("This is an aritmatic exception");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Finished");
            System.out.println("yes finished");
        }

    }
    }
}

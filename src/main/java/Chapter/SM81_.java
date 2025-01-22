package Chapter;

import java.util.Scanner;

public class SM81_ {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 156;
        marks[2] = 154;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with ");
        int number = sc.nextInt();
        try{
            System.out.println("THe value at array index entered is " +marks[ind]);
            System.out.println("THe value of array-value/number is :" + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}

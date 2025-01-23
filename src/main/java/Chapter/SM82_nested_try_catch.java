package Chapter;

import java.util.Scanner;

public class SM82_nested_try_catch {
    public static void main(String[] args) {
        boolean flag = true;
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=153;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");

        while(flag){
        int  ind = sc.nextInt();
        try{
            System.out.println("Welsome to video nu 82");
            try{
                System.out.println(marks[ind]);
                flag = false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index does not exit");
                System.out.println("Exception at level 2");
            }
        }catch (Exception e){
            System.out.println("Exception at level 1");
        }
    }
        System.out.println("Thanks for using this program");
    }
}

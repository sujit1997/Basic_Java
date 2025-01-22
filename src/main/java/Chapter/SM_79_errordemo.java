package Chapter;

import java.util.Scanner;

public class SM_79_errordemo {
    public static void main(String[] args) {
        // SYntax error Demo
        // b=8; // b not declared
        // Logical error Demo
        // write a program to write all prime number 1-10
        System.out.println(2);
        for(int i=1;i<=10;i++)
        {
            System.out.println(2*i+1);
        }

        // Runtime Error / Exception
        int a ;
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Integer part of 1000 divided by a is " +1000/a);

    }
}

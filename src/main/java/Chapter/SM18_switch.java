package Chapter;

import java.util.Scanner;

public class SM18_switch {

public static void main(String[] args) {

	int age;
	System.out.println("Enter your age");
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();
	
	switch(age){
		
		case 18:
		System.out.println("You are going to became an adult");
		break;
		
		case 23:
		System.out.println("You are going to join a job");
		break;

		case 60:
		System.out.println("You are going to retired");
		break;

		default:
		System.out.println("Enjoy your life");

		}	

		System.out.println("Thanks for using my code");

	}
}
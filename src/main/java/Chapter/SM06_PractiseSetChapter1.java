package Chapter;

import java.util.Scanner;

public class SM06_PractiseSetChapter1 {

	public static void main(String[] args) {
	

	//problem 1 Write a program to addition of three anumber
	int a = 15;
	int b = 16;
	int c = 84;
	int sum = a+b+c;
	System.out.println(sum);
	
	// problem 2 Write a program to calculate(GPA using marks of three subjects out of 100)
	float subject1 = 60;
	float subject2 = 68;
	float subject3 = 84;
	float gpa = (subject1 + subject2 + subject3)/30;
	System.out.println(gpa);

	//Prg 3
	
//	System.out.println("Enter the name you want to use in line");
//	Scanner sc = new Scanner(System.in);
//	String name = sc.next();
//	System.out.println("Hello "+ name + ", have a good day");

	//prg 4 
	System.out.println("EnterYour Number");
	Scanner sc = new Scanner(System.in);
	System.out.println(sc.hasNextInt());	
	}
}
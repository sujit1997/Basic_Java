import java.util.Scanner;

public class SM06_Percentage {

	public static void main(String[] args) {
		
	System.out.println("Percentage Calculator");
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the marks obtained in subject 1 :");	
	float a = sc.nextFloat();	
	System.out.println("Enter the total marks of subject 1 :");
	Float a1 = sc.nextFloat();

	System.out.println("Enter the marks obtained in subject 2 :");	
	float b = sc.nextFloat();	
	System.out.println("Enter the total marks of subject 2 :");
	Float b1 = sc.nextFloat();

	System.out.println("Enter the marks obtained in subject 3 :");	
	float c = sc.nextFloat();	
	System.out.println("Enter the total marks of subject 3 :");
	Float c1 = sc.nextFloat();

	System.out.println("Enter the marks obtained in subject 4 :");	
	float d = sc.nextFloat();	
	System.out.println("Enter the total marks of subject 4 :");
	Float d1 = sc.nextFloat();
	
	System.out.println("Enter the marks obtained in subject 5 :");	
	float e = sc.nextFloat();	
	System.out.println("Enter the total marks of subject 5 :");
	Float e1 = sc.nextFloat();

	float totalMarksObtained = a + b + c + d + e;
	float totalMarks = a1 + b1 + c1 + d1 + e1 ;

	float per = totalMarksObtained/totalMarks *100 ;
	System.out.println("Percentage of Student is : ");
	System.out.print(per);
	}
}
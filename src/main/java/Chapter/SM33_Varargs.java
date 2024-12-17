import java.util.Scanner;
public class SM33_Varargs {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks of subject 1 : ");
	float a = sc.nextFloat();

	System.out.println("Enter marks of subject 2 : ");
	float b = sc.nextFloat();

	System.out.println("Enter marks of subject 3 : ");
	float c = sc.nextFloat();
	
	float per = (a+b+c)/300*100;
	float cgpaa = (a/100)*10;
	float cgpab = (b/100)*10;
	float cgpac = (c/100)*10;
	float cgpa = (cgpaa+cgpab+cgpac)/3;
	
	System.out.printf("The cgpa is : %.2f%n", cgpa);
	System.out.println(per);
	
	
	
	}
} 
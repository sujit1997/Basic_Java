import java.util.Scanner;

public class SM19_PS_CH4 {

	public static void main(String[] args){
	
	// Problem 1	
	// int a = 10;
	// if(a=11){
	// System.out.println("I am 11");
	// }
	// else{
	// System.out.println("I am not 11");	
	// }

	// Problem 2
	int s1, s2, s3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your marks in subject 1");
	s1 = sc.nextByte();

	System.out.println("Enter your marks in subject 2");
	s2 = sc.nextByte();
	
	System.out.println("Enter your marks in subject 3");
	s3 = sc.nextByte();	
		
	float avg = (s1 + s2 + s3) / 3.0f;
	System.out.println("Your over all percentage is " + avg);
	if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
	
	System.out.println("Congratulation, you are promoted");
	
	}
	else{
	System.out.println("Sorry, you have not promoted! please try again");
	}
	}

}
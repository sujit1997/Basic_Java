import java.util.Scanner;

public class SM18_elseif {
	
	public static void main(String[] args) {
	
	int age;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your age");
	age = sc.nextInt();
	
	
	if(age>56) {
		
		System.out.println("You are experienced");
		
		}
	else if (age>45){

			System.out.println("You are semi experienced");

			}

	else if (age>35){

			System.out.println("You are semi-semi Experienced");
		
			}	
	else{
	System.out.println("You are not experienced");
	}
	
	}
}
package Chapter;

import java.util.Scanner;
 
public class SM19_PS_CH4_Q5 {

public static void main(String[] args) {

	System.out.println("Enter your website name : ");
	Scanner	sc = new Scanner(System.in);
		
	String website = sc.next();
		
	if(website.endsWith(".org")){
	System.out.println("This is an organizational website");
	}
	
	else if(website.endsWith(".com")){
	System.out.println("This is an commercial website");
	}

	else if(website.endsWith(".in")){
	System.out.println("This is an Indian website");
 	}

	}
}
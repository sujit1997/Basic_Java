public class SM17_logical {

	public static void main(String[] args) {
	
	System.out.println("For Logical AND &&");
	boolean a = true;
	boolean b = true;
	boolean c = false;
	
	if( a && b && c ){
	
	System.out.println("Y");
	
	}
	else{
	System.out.println("N");
	}
	
	// LOGICAL OR
	System.out.println("For Logical OR ||");
	boolean a1 = true;
	boolean b1 = false;
	
	if(a||b){
	
	System.out.println("Y");
	}
	else{
	System.out.println("N");
	}

	//lOGICAL NOT
	System.out.println("For Logical not");
	System.out.print("NOT(A) is :");
	System.out.println(!a);
	
	System.out.print("NOT(B) is :");
	System.out.println(!b);

	System.out.print("NOT(C) is :");
	System.out.println(!c);

	}
}
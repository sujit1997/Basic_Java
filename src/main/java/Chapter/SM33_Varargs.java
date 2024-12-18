package Chapter;

public class SM33_Varargs {
	//static int sum(int a, int b){
	//	return a+b;
	//}
	//static int sum(int a, int b, int c){
	//	return a+b+c;
	//}
	//static int sum(int a,int d, int b, int c){
	//	return a+b+c+d;
	//}
	static int sum(int x,int ...arr) { // int x is use for mandatory one element
		// Available as int []arr;
		int result = x;
		for(int a: arr){
			result +=a;
		}
		return result;

	}



	public static void main(String[] args){
		System.out.println("Welcome to varargs tutorial");
		// System.out.println("The sum of nothing is : " +sum());
		System.out.println("The sum of 4 is : " +sum(4));
		System.out.println("The sum of 4 and 5 is : " +sum(4,5));
		System.out.println("The sum of 4, 3 and 5 is : " +sum(4, 3, 5));
		System.out.println("The sum of 4, 3 and 5 is : " +sum(1, 4, 2, 3, 5));
	
	}
} 
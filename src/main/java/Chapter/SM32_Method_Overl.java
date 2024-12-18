// Method Overloading
public class SM32_Method_Overl {
	static void foo(){
		System.out.println("good morning bro!");
	}
	static void foo(int a){
		System.out.println("good morning " +a+" bro");
	}
	static void foo(int a, int b){ // a and b are parameter
		System.out.println("good morning " +a+" bro");
		System.out.println("good morning " +b+" bro");
	}
	static void change(int a) {
		a = 98;
		}
		static void change2(int []arr){
		arr[0] = 98;
		}
	static void tellJoke () {
		System.out.println("I invented a new word\n" +
				"Plagiarism!");
	}
	public static void main(String[] args) {
		// tellJoke();
		int [] marks = {96,74,85,32,45};
		// changing the integer
		// int x = 45;
		// change(x);
		//System.out.println("the value of x after change is : "+x);

		// changing the array integer
		//change2(marks);
		//System.out.println("The value after running is :" + marks[0]);

		// Method Overloading
		foo();
		foo(300);
		foo(200,300);// Arguments are actual 200,300 is argument
	}
}

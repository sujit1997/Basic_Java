// Method Overloading
public class SM32_Method_Overloading {
	
	static void foo(){
		System.out.println("Good Morning bro !");
			}
	static void foo(int a){
		 System.out.println("Good Morning " +a+ " bro!");
			}
	static void foo(int a, int b){
		System.out.println("Good Morning " +a+ " bro!");
		System.out.println("Good Morning " +b+ " bro!");
			}


	static void change(int a){
		a = 98;
			}
	
	static void change2(int [] arr){
		arr[0] = 98;
			}
	static void tellJoke(){
		System.out.println("I invented a new word\n" +
					"Plagiarism");
				}
	
	public static void main(String[] args){
					//tellJoke();
			
			int [] marks = {52, 73, 95, 45, 67};
			
			// Case 1 : Changing The Integer			
			// int x = 45;
			// change(x);
			// System.out.println("The value of x after running change is : " + x);		
		
			// Case 2 : CHanging the array
			// change2(marks);
			// System.out.println("The value of x after tunning change is : " + marks[0]);

	// Method Overloading
	foo();
	foo(3000);
	foo(55,100);
	// Arguments are actual
		
	}
}
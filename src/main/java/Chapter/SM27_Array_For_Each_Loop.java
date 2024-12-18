package Chapter;

public class SM27_Array_For_Each_Loop {

	public static void main(String[] args){

	// String [] Students = {"harry", "Rohan", "lokesh"};
	// System.out.println(Students.length);
	// System.out.println(Students[0]);

	int [] marks = {56, 56, 98, 45, 73};
	
	// System.out.println(marks.length);
	// System.out.println(marks[0]);

	// Printing using for loop
	 for(int i=0; i<marks.length; i++){
		System.out.println(marks[i]);
		}
	

	// Printing using for loops in reverse order
	System.out.println("Display using reverse order");
	for(int i = marks.length-1; i>=0; i--){
		System.out.println(marks[i]);
		}

	// display using for each loop
	System.out.println("Printing using for-each loop");
	for(int element: marks){
		System.out.println(element);
		}

	}

}
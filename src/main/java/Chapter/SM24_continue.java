public class SM24_continue {

	public static void main(String[] args){
	
	// continue statement program 1 
//		for(int i=0; i<=5; i++) {
//			if(i==2){
//				System.out.println("Ending the loop here");
//				continue;
//				}
//			System.out.println(i);
//			System.out.println("Java is great");
//					}

	// Continue statement with do while loop

	int i=0;
	do{
		i++;
		if(i==2){
			System.out.println(i);
			continue;
			}
		System.out.println(i);
		System.out.println("Java is great");
	} while(i<5);
	System.out.println("Loop ends here");

						}



}
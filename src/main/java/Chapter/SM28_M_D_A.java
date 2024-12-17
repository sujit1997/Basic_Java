public class SM28_M_D_A {

	public static void main(String[] args) {

		int[] marks; // 1-D array
		int[][] flats; // 2-D array

		flats = new int[2][4]; // Initialize a 2x4 2-D array

		// Initialize the array elements
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[0][3] = 104;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		flats[1][3] = 204;

		// Display the array using nested for loop
		System.out.println("Printing the 2-D array using for loop:");
		for (int i = 0; i < flats.length; i++) { // Rows
			for (int j = 0; j < flats[i].length; j++) { // Columns
				System.out.print(flats[i][j] + " ");
			}
			System.out.println();
		}
	}
}

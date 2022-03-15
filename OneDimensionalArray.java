// 11. Write statements that perform the following one‐dimensional‐array operations: a. Set the 10 
//elements of integer array counts to zero. b. Add one to each of the 15 elements of integer array 
//bonus. c. Display the five values of integer array bestScores in column format.

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	
		int bonus[];

		bonus = new int[15]; 

		for (int i = 0; i < 15; i++) { 
			
			bonus[i] = bonus[i]+ 1;
			System.out.println(i);
		}
		
		int bestScores[] = { 10, 20, 30, 40, 50 };
		
		for (int j = 0; j < 5; j++) {
			System.out.printf("%d\t", bestScores[j]); 
		}
	}
}

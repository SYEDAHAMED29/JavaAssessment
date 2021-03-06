
//
//12. Write a Java application that allows the user to enter up to 20 integer grades into an array. Stop 
//the loop by typing in ‐1. Your main method should call an Average method that returns the 
//average of the grades. Use the DecimalFormat class to format the average to 2 decimal places

import java.util.Scanner;

public class TwentyIntegerGrades {

	public static double Average(int grades[], int max) {
		int sum = 0;
		double average = 0.0;

		for (int i = 1; i < max; i++) { 
			sum += grades[i];
			average = sum / (i);
		}
		return average; 
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, grades[]; 
		grades = new int[20];

		for (i = 0; i < 20; i++) { 
			System.out.printf("Enter Grade: ");
			grades[i] = sc.nextInt();
			if (grades[i] == -1)
				break;
		}
		System.out.printf("%.2f", Average(grades, i - 1));
	}
}

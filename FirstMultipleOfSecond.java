//8. Write an application that reads two integers, determines whether the first is a multiple of the 
//second and print the result.

import java.util.Scanner;

public class FirstMultipleOfSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		
		System.out.println("Enter the two numbers");
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println(num1 + " is a multiple of " + num2);
		}
		else {
			System.out.println(num1 + " is not a multiple of " + num2);
		}

	}

}

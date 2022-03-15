
//6. Write an application that asks the user to enter two integers, obtains them from the user and 
//displays the larger number followed by the words “is larger”. If the numbers are equal, print 
//“These numbers are equal”


import java.util.Scanner;

public class LargerOrEqual {
	
	public static void main(String[] args) {
		
		int a,b;
		System.out.println("Enter any two numbers");
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		if(a > b) {
			System.out.println(a+" is larger");
		}
		
		else if(b > a) {
			System.out.println(b + " is larger");
		}
		
		else {
			System.out.println("These numbers are equal");
		}
		
	}
}

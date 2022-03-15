

// 2. Write a program that calculates and prints the product of three integers
import java.util.Scanner;

public class ProductOfThreeIntegers {
	
	public static void main(String[] args) {
	
		int a,b,c,product;
		System.out.println("Enter any three integers");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b= sc.nextInt();
		c = sc.nextInt();
	
		
	    product = a*b*c;
	    
	    System.out.println("The product of three integers is "  + product);
	}
	
	

}

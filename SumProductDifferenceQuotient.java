
//5. Write an application that asks the user to enter two integers, obtains them from the user and 
//prints their sum, product, difference and quotient (division)

import java.util.Scanner;

public class SumProductDifferenceQuotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,sum,product,difference,quotient;
		
		System.out.println("Enter the two integers");
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		sum = a+b;
		
		product = a*b;
		
		difference = a-b;
		
		quotient = a/b;
		
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);
		System.out.println("The quotient is " + quotient);
		

	}

}

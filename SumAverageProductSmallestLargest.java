
//7. Write an application that inputs three integers from the user and displays the sum, average, 
//product, smallest and largest of the numbers.

import java.util.Scanner;

public class SumAverageProductSmallestLargest {
	
	public static void main(String[] args) {
		
		int a,b,c,sum,product,largest,smallest;
		float average;
		
		System.out.println("Enter the three numbers");
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		sum = a+b+c;
		product = a*b*c;
		average = sum/3;
		
		largest = a;
        smallest = b;

        if(b > largest)
            largest = b;

        if(c > largest)
            largest = c;

        if(b < smallest)
            smallest = b;

        if (c < smallest)
            smallest = c;
        
        System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The average is " + average);
		System.out.println("The largest is " + largest);
		System.out.println("The smallest is " + smallest);
		
		
	}

}

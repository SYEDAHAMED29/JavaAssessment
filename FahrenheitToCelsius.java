

// 3. Write a program that converts a Fahrenheit degree to Celsius

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Fahrenheit, Celsius; 
		
		System.out.println("Enter the Temperature in Fahrenheit");
		
		Scanner s = new Scanner(System.in);
		
        Fahrenheit = s.nextFloat();  
        
        Celsius  = ( (Fahrenheit-32)*5) /9; 
        
        System.out.println("Temperature in celsius is: "+Celsius); 

	}

}

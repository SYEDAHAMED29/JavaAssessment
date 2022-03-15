
//10. Write a complete Java application to prompt the user for the double radius of a sphere, and call 
//method sphereVolume to calculate and display the volume of the sphere.

import java.util.Scanner;


public class VolumeOfSphere {

	public static double sphereVolume(double radius) {
		return (4/3) * 3.14 * Math.pow(radius, 3);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double radius, volume;

		System.out.println("Enter Radius: ");
		
		radius = sc.nextInt();
		System.out.printf("Volume = %.3f", sphereVolume(radius));
		
	}
}

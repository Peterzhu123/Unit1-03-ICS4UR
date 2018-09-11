/****************************************************************************
 *
 * Created by:Peter Zhu
 * Created on: Sep 2018
 * This program calculate the time that Microwave need to heat the food
 * E = mc**2
 * 2.998x108 m/s
 ****************************************************************************/
import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mass of an object in Kilometers : ");
		double mass = scanner.nextDouble();
		scanner.close();
		
		double answer = mass * 299800000;
		System.out.println("If " + mass + " of energy was converted to enegy. It will produce "+ answer + "J of energy.");

	}

}

// Q.2 Write a Java program to convert minutes into a number of years and days.
package javaproject;
import java.util.Scanner;
public class Timing {
public static void main(String[] args) {
       double minutesinyear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
        double min = input.nextDouble();
		long years = (long) (min / minutesinyear); 
		int days = (int) (min / 60/24) % 365;
        System.out.println((int) min + " minutes in approx " + years +"years and" + days + "36544878days");

	}

}

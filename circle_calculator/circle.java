package circle_calculator;
import java.util.*;
import java.math.*;

public class circle {
	
	// 2.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	
	public static void main(String args[]) {
		
		System.out.println("Enter the radius of circle: ");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		
		double c=circum(r);
		System.out.println("The circumfrence of circle is:");
		System.out.println(c);
		
		double a=area(r);
		System.out.println(a);
		
		
	}
	
	public static double circum(int r) {
		double g=2*Math.PI*r;
		return g;
	}
	
	public static double area(int r) {
		double k=Math.PI*r*r;
		return k;
	}

}

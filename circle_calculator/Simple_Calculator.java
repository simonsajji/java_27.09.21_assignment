package circle_calculator;

import java.util.Scanner;

public class Simple_Calculator {
	
	// 1.Get two numbers as input from user and call method for addition and multiplication, and print respective outputs
	
	public static void main(String args[]) {
		System.out.println(" Enter two numbers");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		scan.nextLine();
		System.out.println("Enter the operation:-1.sum 2.mul");
		String operator=scan.nextLine();
		
		if(operator=="sum") {
			int j=sum(a,b);
			System.out.println(j);
		}
		else {
			int k=mul(a,b);
			System.out.println(k);
		}
		
		scan.close();
		
		
		
	}
	
	public static int sum(int d,int h) {
		return (d+h);
	}
	
	public static int mul(int d,int h) {
		return (d*h);
	}
	
	

}

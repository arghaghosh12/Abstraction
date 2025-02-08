package com;
import java.util.Scanner;
class CalculatorMainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//rule ->4 Upcasting
		Calculator c=new CalculatorImpl();
		c.add(a, b);
		c.multiply(a, b);
		sc.close();
	}

}

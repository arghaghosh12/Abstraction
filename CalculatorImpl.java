package com;

class CalculatorImpl implements Calculator {//Rule -2
	@Override//rule -3
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of "+a+ " & "+b+" is: "+sum);
	}
	@Override//rule -3
	public void multiply(int a,int b)
	{
		System.out.println("Product of "+a+ " & "+b+ " is: "+( a*b));
	}

}

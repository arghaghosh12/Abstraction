package com;
import java.util.Scanner;
class BankMainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to Our Bank!!");
		System.out.println("---------------------");
		Scanner sc=new Scanner(System.in);
		Bank b=new BankImpl();
		while(true)
		{
			//Infinite loop
			//Manu Driven Program
			System.out.println("1:Deposit Amount\n2:Withdraw Amount");
			System.out.println("3:CheckBalance\n4:Exit\nEnter Choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to deposit: ");
				int n=sc.nextInt();
				b.deposit(n);
				b.checkBalance();
				break;
			case 2:
				System.out.println("Enter the amount for withdraw: ");
				int m=sc.nextInt();
				b.withdraw(m);
				break;
			case 3:
				b.checkBalance();
				break;
			case 4:
				System.out.println("Thank You!! Visit Again!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("--------------");
		}
	}
}

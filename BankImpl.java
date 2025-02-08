 package com;

class BankImpl implements Bank{
	
	int balance=5000;
	@Override
	public void deposit(int amount)
	{
		System.out.println("Depositing Rs. "+amount);
		balance=balance+amount;//balance+=amount
		System.out.println("Amount deposited successful.");
	}
	public void withdraw(int amount)
	{
		System.out.println("WithDrawing Rs. "+amount);
		balance-=amount;//balance=balance-amount;
		System.out.println("Amount withdrawn successful.");	
	}
	public void checkBalance()
	{
		System.out.println("Avalaiable balance is: " +balance);
		
	}

}

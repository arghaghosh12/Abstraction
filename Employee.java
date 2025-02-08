package com;

abstract class Employee {
	abstract void work();

}
class Developer extends Employee
{
	void work()
	{
		System.out.println("Developer develop the apps");
	}
	
}
class Tester extends Employee
{
	void work()
	{
		System.out.println("Tester testing the apps");
	}
}

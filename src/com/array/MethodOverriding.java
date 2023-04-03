package com.array;

class First
{
	public First()
	{
		System.out.println("First constructor..");
	}
	public void display()
	{
		System.out.println("This is First Class Display Method..");
	}
	
}
class Second extends First
{
	public Second()
	{
		System.out.println("Second Constructor..");
	}
	public void display()
	{
		System.out.println("This os Second Class Display Method..");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		Second f1 = new Second();
		f1.display();
		f1=new Second();
		f1.display();
	}
}

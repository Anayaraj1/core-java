package com.array;

class Sum
{
	int x,y;
	public Sum()
	{
		x=20;
		y=10;
		System.out.println("First Sum is..."+(x+y));
		
	}
	public Sum (int a)//parameterized constructor
	{
		x=a;
		y=a;
		System.out.println("Second Sum is ..."+(x+y));
	}
	public Sum (float a) // parameterized constructor here we pass the argument in this line ..
	{
		x=(int)a;
		y=(int)a;
		System.out.println("Third value is .."+(x+y));
	}
	public Sum(int a ,int b) //Parameterized Constructor but 2 arguments pass here ..
	{
		x=a;
		y=b;
		System.out.println("Fourth value is..."+(x+y));
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		Sum s1 = new Sum();
		new Sum(60);
		new Sum(50);
		new Sum(40,40);
	}
}

package com.array;
class Addition
{
	int x,y;
	public void sum()//one type of constructor
	
	{
		x=10;
		y=20;
		System.out.println("Firsy sum is..."+(x+y));
	}
	public void sum(int a)
	{
		x=y=a;
		System.out.println("Second sum is..."+(x+y));
	}
	public void sum(int a ,int b)
	{
		x=a;
		y=b;
		System.out.println("Third sum is..."+(x+y));
	}
	public void sum(float a)
	{
		x=y=(int)a;
		System.out.println("Fourth sum is..."+(x+y));
	}
}
public class MethodOverloadingDemo 
{
	public static void main(String[] args) 
	{
		Addition a1 = new Addition();
		a1.sum();
		a1.sum(45);
		a1.sum(45, 78);
		a1.sum(50.230f);
	}
}

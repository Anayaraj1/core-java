package com.key;

abstract class ADemo
{
	int no ;
	String name;

	public abstract void setData();
	public void show()
	{
		System.out.println("No is .."+no);
		System.out.println("Name is.."+name);
	}
}
abstract class Demo extends ADemo
{
	
}
class Demo1 extends Demo
{

	public void setData() 
	{
		no =123;
		name="Tapan";
		
	}
	
}

public class AbstractionDemo 
{
	public static void main(String[] args) 
	{
		Demo1 d1= new Demo1();
		d1.setData();
		d1.show();
	}

}

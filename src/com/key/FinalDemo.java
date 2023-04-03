package com.key;

class FDemo
{
	final int no=100;
	String name;
	public final void setData()
	{
		//no=123;
		name = "Tapan";
	}
	public void show()
	{
		System.out.println("No is.."+no);
		System.out.println("Name is..."+name);
	}
}
class CDemo extends FDemo 
{
	int no=99;
	String name;
//	public  void setData()
//	{
//		//no=123;
//		name = "Sunny";
//	}
	public void show()
	{
		System.out.println("No is.."+no);
		System.out.println("Name is..."+name);
	}
}
public class FinalDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1 = new FDemo();
		CDemo c1 = new CDemo();
		f1.setData();
		f1.show();
		c1.setData();
		c1.show();
	}
}

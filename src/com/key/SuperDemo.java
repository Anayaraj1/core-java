package com.key;

class SSDemo
{
	public SSDemo()
	{
		System.out.println("This is Parent Class....");
	}
	int no ;
	String name;
	public void setData(int no,String name)
	{
		this.no= no ;
		this.name = name;
	}
	
}
class SSDemo1  extends SSDemo
{
	public SSDemo1()
	{
		System.out.println("THIS IS CHILD CLASS..");
	}
	int no ;
	public void show()
	{
		//setData(789,"TPN");
		System.out.println("No is ..."+super.no);
		System.out.println("Name is..."+name);
	}
}
public class SuperDemo 
{
	public static void main(String[] args) 
	{
		SSDemo1 sd1 = new  SSDemo1();
		sd1.setData(123,"Tapan");
		sd1.show();
		
					
		
	}
}

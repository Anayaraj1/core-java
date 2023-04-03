package com.key;

class Staff
{
	String name;
	public void setSData()
	{
		name ="rajkot";
	}
}
class Inter extends Staff implements Student // so that java isn't pure oops.
{
	String city="Abad";
	
	public void setData() 
	{
		// TODO Auto-generated method stub
		//super.setSData();
		System.out.println("No is..."+no);
		System.out.println("CITY is..."+city);
		System.out.println("Grade is..."+grade);
		
		
	}
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Inter i1 = new Inter();
		i1.setData();
		i1.setSData();
		
		
	}
}



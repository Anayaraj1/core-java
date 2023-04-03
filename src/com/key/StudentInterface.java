package com.key;

interface Result1
{
	String grade = "A++";
	int  no =987;
}

public interface StudentInterface extends Result1
{   
	
	public static void setData()
	{
		System.out.println("Grade is: "+grade);
		System.out.println("Number is : "+no);
	}
	
}

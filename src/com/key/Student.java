package com.key;


interface Result
{
	String grade = "A+";
	
}

public interface Student extends Result 
{
	int no = 12345;
	public void setData();
}

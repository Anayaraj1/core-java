package com.array;

public class Employee 
{
	int sno ;
	String name,city,degree;
	public void setData() //methods
	{
		sno = 123456;
		name="Tapan Mewada";
		city= "Ahmedabad";
		degree="B.tech";
		
	}
	public void show()//methods
	{
		System.out.println("EMP Nubmber ...."+sno);
		System.out.println("Name of EMP...."+name);
		System.out.println("City  of EMP...."+city);
		System.out.println("Degree of EMP...."+degree);
	}
}

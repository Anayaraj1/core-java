package com.array;


public class ClassDemo2 
{
	int sno ;
	String name,city,degree;
	public void student1()
	{
		sno = 123456;
		name="Tapan Mewada";
		city= "Ahmedabad";
		degree="B.tech";
		
	}
	public void student2()
	{
		sno = 456465;
		name="Bhautik";
		city= "Ahmedabad";
		degree="B.tech";
		
	}
	
	public void show()
	{
		System.out.println("Employee Nubmber ...."+sno);
		System.out.println("Name of Employee...."+name);
		System.out.println("City  of Employee...."+city);
		System.out.println("Degree of Employee...."+degree);
		System.out.println("     ");
	}
	
	
	
	 public static void main(String[] args) 
	 {
		ClassDemo2 c1= new ClassDemo2();
		ClassDemo2 c2=new ClassDemo2();
		c1.student1();
		c2.student2();
		c1.show();
		c2.show();
	 }
}

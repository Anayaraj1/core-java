package com.array;

class Student 
{
	int sno ;
	String name,city,degree;
	public void setData() ///methods 
	{
		sno = 123456;
		name="Tapan Mewada";
		city= "Ahmedabad";
		degree="B.tech";
		
	
	//public void show()// method 
	//{
		System.out.println("Student Nubmber ...."+sno);
		System.out.println("Name of student...."+name);
		System.out.println("City  of student...."+city);
		System.out.println("Degree of student...."+degree);
		System.out.println("    ");
	//}
	}
}

public class ClassDemo //main class 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(); // object  
		s1.setData();
	//	s1.show();
		
	}
}

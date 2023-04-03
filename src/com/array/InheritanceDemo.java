package com.array;


class Student2 // Grand parent Class 
{	
	int no;
	String name;
	public void SetData()					//this is two  suction Single class Inheritance.
	{
		no = 123;
		name = "Tapan";
	}
}
class Sport2 extends  Student2   // Parent class
{
	String spname;
	public void SetSportData()
	{
			spname = "Cricket";
	}
	public void display()
	{
		System.out.println("No is..."+no);
		System.out.println("Name is ..."+name);
		System.out.println("Spname is ..."+spname);
	}
}
class Result2 extends Sport2 // child class 
{
	String grade;
	public void SetResultData()
	{
		grade = "A++";
		
	}
	public void display()
	{
		System.out.println("No is..."+no);
		System.out.println("Name is ..."+name);
		System.out.println("Spname is ..."+spname);
		System.out.println("Result grade is..."+grade);
	}

}


public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
	     Result2 s2 = new Result2();
	     s2.SetData();
	     s2.SetSportData();
	     s2.SetResultData();
	     s2.display();
	}
}

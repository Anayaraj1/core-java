package com.array;

class Students2 // Parent parent Class 
{	
	int no;
	String name;
	public void SetData()					//this is two  suction Single class Inheritance.
	{
		no = 123;
		name = "Tapan";
	}
}
class Sports2 extends  Student2   // Child class
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
class Results2 extends Student2 // child class 
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
		System.out.println("Result grade is..."+grade);
	}

}





public class InheritanceHirachical 
{
	public static void main(String[] args) 
	{
		 Results2 s2 = new Results2();
	     s2.SetData();
	     s2.SetResultData();
	     s2.display();
	     
	     Sports2 s1 = new Sports2();
	     s1.SetData();
	     s1.SetSportData();
	     s1.display();
	}
}

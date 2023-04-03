package com.th;


class First extends Thread
{
	public void run()
	{
		for(int i=1 ; i<=11;i++)
		{
			System.out.println("My First Thread is..."+i);
		}
		System.out.println("My First Thread is complete...");
	}


}
public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		First f1 = new First();
		f1.setName("TOPS...");
		f1.setPriority(10);
		System.out.println(f1);
		
		f1.start();
		System.out.println("IS ALAIV... OR NOT "+f1.isAlive());
		for(int i=1 ; i<=5;i++)
		{
			System.out.println("My Main Thread is..."+i);
		}
		System.out.println("My Main Thread is complete...");
		System.out.println("IS ALAIV... OR NOT "+f1.isAlive());
	}
}

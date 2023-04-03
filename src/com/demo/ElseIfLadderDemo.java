package com.demo;

public class ElseIfLadderDemo
{
	public static void main(String[] args) 
	{
		int a=200,b=200,c=200;
		if(a>b && a>c)
		{
			System.out.println("A is max...");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is Max...");
		}
		else
		{
			System.out.println("C is Max");
		}
	}
}

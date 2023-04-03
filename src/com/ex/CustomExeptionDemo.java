package com.ex;

import java.util.Scanner;

class NoBalanceInATMExeption extends Exception  //give the meaningful name for exception  
{
	double amount ;
	public NoBalanceInATMExeption (double amount) // make a constructor
	{
		this.amount = amount;
	}
}

class ATM
{
	double balance ; 
	public void deposit(double amount)
	{
		balance = balance + amount ;
		System.out.println(amount+"rs deposited...");
	}
	public void withdrawal(double amount) throws NoBalanceInATMExeption
	{
		if (amount <= balance)
		{
			balance =balance -amount;
			System.out.println(amount+"Rs withdrawal successfully...");
		}
		else
		{
			double needs= amount -balance;
			throw new NoBalanceInATMExeption (needs);
		}
		
	}
}
public class CustomExeptionDemo 
{
	public static void main(String[] args) 
	{
		ATM a1 = new ATM();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount for deposite::");
		double amount = sc.nextDouble();
		
		a1.deposit(amount);
		System.out.println("Enter amount for withdrawal..");
		amount=sc.nextDouble();
		
		
		
		try
		{
			a1.withdrawal(amount);
		}catch(NoBalanceInATMExeption e)
		{
			System.out.println("if you enter"+e.amount+"rs more into your acc then withdrawal");
			//e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

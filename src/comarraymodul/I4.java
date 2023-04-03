package comarraymodul;

import java.util.Scanner;

public class I4 
{
	// W.A.J.P to reverse an array of integer values.
	public static void main(String[] args) 
	{
		int ar[] = new int [5] ;
		Scanner  sc = new Scanner (System.in);
		
		for (int i = 0; i < 5 ; i++)
		{
			System.out.println("Enter Array Value::"+i);
			ar[i] = sc.nextInt();
			
		}
		System.out.println("Array Size is.."+ar.length);
		System.out.println("....Array is....");
		for(int i=0;i<5;i++)
		{
			
			System.out.print(ar[i]+" ");
			
			
		}
		System.out.println(" ");
		System.out.println("....reverse Array....");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
}

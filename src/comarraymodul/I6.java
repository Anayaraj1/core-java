package comarraymodul;

import java.util.Scanner;

public class I6 
{
	//W.A.J.P to find the duplicate values of an array of string values
	public static void main(String[] args) 
	{
		String s[] = new String [6];
		int lan = s.length;
	
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<6;i++)
		{
			System.out.println("Enter Values in String.."+i);
			 s[i]= sc.next();
		}
		
		System.out.println("...Your Array is...");
		for(int i =0 ;i<6;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println(" ");
		System.out.println("...Reverse string...");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
}

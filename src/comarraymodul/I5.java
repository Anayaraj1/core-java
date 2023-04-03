package comarraymodul;

import java.util.Scanner;

public class I5 
{
	public static void main(String[] args) 
	{
		// W.A.J.P to find the duplicate values of an array of integer values.

		
		
		int a[] =new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Value..."+i);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int x = 0;x<a.length;x++)
		{
			for(int y = x+1; y<a.length;y++)
			{
				if((a [x]== a[y]) &&(x!=y) )
				{
					System.out.println("Repeated Values are...");
					System.out.println(a[y]);
				}
				
			}
		}
	}
}

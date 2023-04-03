package comarraymodul;

import java.util.Arrays;

public class B10 
{
	public static void main(String[] args) 
	{
		int [] a = {10,30,20,50,86,63,11};
		String [] s = {"s","f","z","h","j","r","t","y"};
		
		System.out.println("Original Array "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array "+Arrays.toString(a));
		
		System.out.println(" ");
		
		System.out.println("Original Array "+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("Sorted   Array " + Arrays.toString(s));
		
	}
}

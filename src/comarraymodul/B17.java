package comarraymodul;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class B17 
{
	
	//maximum and minimum value of an array
	public static void main(String[] args) 
	{
		Integer v [] = {12,13,20,10,50};
		
		Arrays.sort(v);
		System.out.println("Sorted array is...."+Arrays.toString(v));
		System.out.println(" ");
		
		int min = Collections.min(Arrays.asList(v));
		int max = Collections.max(Arrays.asList(v));
		
		System.out.println("Minimum Number is....."+min);
		System.out.println(" ");
		System.out.println("Maximum Number is....."+max);
		
				
	}
}

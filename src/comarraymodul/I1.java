package comarraymodul;

import java.util.ArrayList;
import java.util.Scanner;

public class I1
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList(5);
		System.out.println("Default size is..."+a1.size());
		System.out.println("Default value is..."+a1);
		
		
		a1.add("Tapan");
		a1.add(123);
		a1.add("ahmedabad");
		a1.add("6th IT");
		
		System.out.println("size is..."+a1.size());
		System.out.println("value is..."+a1);
		
		a1.remove(3);
		
		System.out.println("Now size is..."+a1.size());
		System.out.println("Value is..."+a1);
		
		a1.remove(1);
		System.out.println("Now size is..."+a1.size());
		System.out.println("Value is..."+a1);
		
	}
}

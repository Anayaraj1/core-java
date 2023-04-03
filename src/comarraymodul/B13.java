package comarraymodul;
import java.util.Scanner;

public class B13 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of Arry::");
		int size = sc.nextInt();
		
		int ary [] = new int [size];
		
		int sum = 0 ; //initialization 
		
		
		for(int i = 0 ; i <size; i++)
		{
				
				System.out.println("Enter Value..."+(i+1));
				ary[i] = sc.nextInt();
				sum = sum + ary[i];
				
		}
		System.out.println(" ");
		System.out.println("Elements of the arry are ===  "+sum);
		System.out.println("Average of Elemnets are === "+(sum/size));
		
	}
}

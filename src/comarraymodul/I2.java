package comarraymodul;

import java.util.Arrays;

public class I2 
{
	 public static void main(String[] args) 
	 {
		 int arr [] = new int[] {10,20,50,30,40,22,10,50};
		 
		 Arrays.sort(arr);
		 System.out.println("Array is sorting is."+Arrays.toString(arr));
		 
		 for(int s=0;s<arr.length;s++)
		 {
			 for (int j=s+1;j<arr.length;j++)
			 {
				 if(arr[s] == arr[j])
				 {
					 System.out.println("Same Value Is..."+arr[j]);
				 }
			 }
			 
		 }
		 
		 
	 }
}

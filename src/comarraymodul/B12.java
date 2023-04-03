package comarraymodul;

public class B12 
{
		
	public static void main(String[] args) 
	{
		int []arry = new int[] {15,15,20};
		int sum = 0;
		
		for (int i= 0 ; i<arry.length;i++)
		{
			sum = sum+ arry [i];
			
		}
		System.out.println("sum of all element o array " + sum);
	}
}

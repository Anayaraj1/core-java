package com.key;
class SDemos
{
	static class SDemo1
	{
		public static void show()
		{
				sno =321 ;
				System.out.println("Sno is .."+sno);			
		}
	}
	
	int  no ;//non static member //local variable 
	static int sno ; // static member
	static
	{
		sno = 100;
		System.out.println("Static of Block is..."+sno);
	}
}
public class StaticinClass
{
	public static void main(String[] args) 
	{
		SDemos.SDemo1.show();
		SDemos s1 = new SDemos();
		SDemos s2 = new SDemos();
		SDemos s3 = new SDemos();
		
		s1.no=12313;
		s2.no=123213;
		s3.no=456546;
		System.out.println("s1.number is..."+s1.no);
		System.out.println("s2.number is..."+s2.no);
		System.out.println("s3.number is..."+s3.no);
		
		s1.sno = 132;
		s2.sno = 1378;
		s3.sno = 132898;
		System.out.println("snn1.number is..."+s1.sno);
		System.out.println("snn2.number is..."+s2.sno);
		System.out.println("snn3.number is..."+s3.sno);
		
		
		
	}
}

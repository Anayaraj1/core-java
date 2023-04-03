package com.key;



class  Bita 
{
	String name ;
	public void setBitaData()
	{
		
	}
}

class alpha implements StudentInterface 
{
   public void setAlpha()
   {
	   System.out.println("internamtional NO::"+no);
	   System.out.println("international name::"+grade);
	   
   }
}

public class StaticInterfaceDemo 
{
	public static void main(String[] args)
	{
		alpha a1 = new alpha();
		a1.setAlpha();
	}
}

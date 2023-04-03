package com.th;


class Second implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=1 ; i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("my second thread is..."+i);
		}
		System.out.println("My second threadn is complete...");
	}
	

}

public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		Second s1 = new Second();
		Thread t1 =  new Thread(s1);
		t1.start();
		for (int i=1 ; i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("my first thread is..."+i);
		}
		System.out.println("My first thread is complete...");
		
			
	}
	
}

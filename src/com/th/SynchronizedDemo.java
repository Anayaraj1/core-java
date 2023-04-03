package com.th;



	class Message 
	{
		public void show(String msg)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.print(" [ "+msg);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" ] ");
		}
	}
	
	class Sync extends Thread
	{
		Message m1 ;
		String msg;
		public Sync(Message m1 ,String msg)
		{
			this.m1 = m1;
			this.msg = msg;
			start();
		}
		
		public void run()
		{
			synchronized (m1)
			{
				m1.show(msg);
			}
			
		}
	}
	
	
	public class SynchronizedDemo 
	{	
	public static void main(String[] args) 
	{
		Message m1 = new Message();
		Sync s1 = new Sync(m1,"Hello");
		Sync s2 = new Sync(m1,"How R U?");
		Sync s3 = new Sync(m1,"Khana Khake Jana");
		
	}
}

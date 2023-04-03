package com.demo;

public class Operators1 
{
public static void main(String[] args) 
{
	float sal=10000 ,pf = 12 , esic =6 ,pf1 = pf/100, esic1 = esic/100, purepf = sal*pf1;
	float pureesic = sal*esic1;
	float purededuct = purepf + pureesic ;
	float totaldedsal = sal - purededuct;
	
	
	System.out.println("Gross Salary:: "+ sal);
	System.out.println("PF Deduction:: "+ purepf);
	System.out.println("ESIC Deduction::"+ pureesic);
	System.out.println("Total Deduction::" + purededuct);
	System.out.println("Deduction vali Saalry::" + totaldedsal);	
}
}

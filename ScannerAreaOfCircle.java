package project1;

import java.util.Scanner;

public class ScannerAreaOfCircle 
{
	double pivalue=Math.PI;
	public static void main(String[] args) 
	{
		Scanner c1=new Scanner(System.in);
		ScannerAreaOfCircle a1=new ScannerAreaOfCircle();
		System.out.println("Enter the value of r");
		int a=        c1.nextInt();
		int b=        c1.nextInt();
		double mul=a1.pivalue*a*b;
		System.out.println("Area of Circel is:");
		
		System.out.println(mul);
		c1.close();
	}
}

package project1;

import java.util.Scanner;

public class ScannerPerimeterOfCircle 
{
    double pivalue=Math.PI;
	public static void main(String[] args) 
	{
		Scanner p1=new Scanner(System.in);
		System.out.println("Enter the value 2");
		int a=     p1.nextInt();
		ScannerPerimeterOfCircle c1=new ScannerPerimeterOfCircle();
		System.out.println("Enter the value of r");
		int r=     p1.nextInt();
		double mul=a*c1.pivalue*r;
		System.out.println("Circumference of Circle is:");
		System.out.println(mul);
		p1.close();
	}
}

package project1;

import java.util.Scanner;

public class ScannerAreaOfTriangle 
{
   public static void main(String[] args) 
   {
	Scanner t1=new Scanner(System.in);
	System.out.println("Enter the value 0.5");
	double a=        t1.nextDouble();
	System.out.println("Enter the value base");
	int b=           t1.nextInt();
	System.out.println("Enter the value height");
	int h=           t1.nextInt();
	System.out.println("Area of Triangle is :");
	double mul=a*b*h;
	System.out.println(mul);
	t1.close();
   }
}

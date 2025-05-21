package project1;

import java.util.Scanner;

public class ScannerAreaOfRectangle {

	public static void main(String[] args) 
	{
		Scanner r1=new Scanner(System.in);
		System.out.println("Enter the value of length of rectangle");
		int l=         r1.nextInt();
		System.out.println("Enter the value of breath of rectangle");
		int b=         r1.nextInt();
		System.out.println("The area of rectangle is :");
		int mul=l*b;
		System.out.println(mul);
		r1.close();	
	}

}

package project1;

import java.util.Scanner;

public class ScannerPerimeterOfRectangle {

	public static void main(String[] args) 
	{
		Scanner p1=new Scanner(System.in);
		System.out.println("Enter the value 2");
		int a=      p1.nextInt();
		System.out.println("Enter the value of length of rectangle");
		int l=      p1.nextInt();
		System.out.println("Enter the value of breath of rectangle");
		int b=      p1.nextInt();
		System.out.println("Perimeter of rectangle is :");
		int mul=a*(l+b);
		System.out.println(mul);
		p1.close();
     }

}

package project1;

import java.util.Scanner;

public class ScannerPerimeterOfSquare {

	public static void main(String[] args) 
	{
		Scanner p1=new Scanner(System.in);
		System.out.println("Enter the value 4");
		int a=      p1.nextInt();
		System.out.println("Enter the value of side of a square");
		int b=      p1.nextInt();
		System.out.println("Perimeter of a square is:");
		int mul=a*b;
		System.out.println(mul);
        p1.close();
	}

}

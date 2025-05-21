package project1;

import java.util.Scanner;

public class ScannerAreaOfSquare {

	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the value side of a square");
		int a=       a1.nextInt();
		System.out.println("Enter the value side of a square");
        int b=       a1.nextInt();
        System.out.println("The Area of a square is :");
        int mul=a*b;
        System.out.println(mul);
        a1.close();
	}

}

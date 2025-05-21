package project1;
import java.util.Scanner;
public class ScannerPerimeterOfTriangle
{
	public static void main(String[] args) 
	{
	Scanner p1=new Scanner(System.in);
	System.out.println("Enter the value a");
	int a=           p1.nextInt();
	System.out.println("Enter the value b");
	int b=           p1.nextInt();
	System.out.println("Enter the value c");
	int c=           p1.nextInt();
	System.out.println("Perimeter of Triangle is :");
	int sum=a+b+c;
	System.out.println(sum);
	p1.close();
	}
}

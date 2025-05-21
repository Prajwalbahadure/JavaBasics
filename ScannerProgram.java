package project1;
import java.util.Scanner;
public class ScannerProgram 
{
	public static void main(String[] args) 
	{
	     Scanner s1=new Scanner(System.in);
	     System.out.println("Please enter the value of a");
	      int a=          s1.nextInt();
	      System.out.println("Please enter the value of b");
	      int b=          s1.nextInt();
	      System.out.println("Please enter the value of c");
	      int c=          s1.nextInt();
	      System.out.println("Please enter the value of d");
	      int d=          s1.nextInt();
	      System.out.println("Answer of a+b+c+d is equal to:");
	      int sum=a+b+c+d;
	      System.out.println(sum);
	      s1.close();
	}

}

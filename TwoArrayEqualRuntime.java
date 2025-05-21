package project1;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayEqualRuntime 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
    	System.out.println("Please enter the size of your array");
    	int age[]=new int[s1.nextInt()];
    	System.out.println("Please enter your age");
    	for(int i=0;i<age.length;i++) 
    	{
    	age[i]= s1.nextInt();
    	}
    	
    	Scanner s2=new Scanner(System.in);
    	int age1[]=new int[s2.nextInt()];
    	System.out.println("Please enter your age");
    	for(int i=0;i<age1.length;i++) 
    	{
    	age[i]= s2.nextInt();
    	}
    	s2.close();
    	boolean b1=Arrays.equals(age,age1);
		System.out.println(b1);
    	
	}

}

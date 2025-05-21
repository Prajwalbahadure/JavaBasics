package project1;

import java.util.Scanner;

public class Array_Value_Runtime 
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

    	s1.close();
	}

}

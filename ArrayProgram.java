package project1;

import java.util.Arrays;

public class ArrayProgram 
{
	public static void main(String[] args) 
	{
		int []age=new int[4];
		age[0]=45;
		age[1]=32;
		age[2]=25;
		age[3]=18;
		Arrays.sort(age);
		System.out.println(Arrays.toString(age));
		
	}

}

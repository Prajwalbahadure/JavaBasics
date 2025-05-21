package project1;

import java.util.Arrays;

public class ArrayProgram1 {

	public static void main(String[] args)
	{
		int []age=new int[4];
		age[0]=40;
		age[1]=21;
		age[2]=25;
		age[3]=30;
		Arrays.sort(age);
		
		System.out.println(Arrays.toString(age));
		
	}

}

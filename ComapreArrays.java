package project1;

import java.util.Arrays;

public class ComapreArrays 
{
	public static void main(String[] args) 
	{
		double []rollno1=new double[4];
		rollno1[0]=21;
		rollno1[1]=23;
		rollno1[2]=25;
		rollno1[3]=30;
		double []rollno2=new double[4];
		rollno2[0]=21;
		rollno2[1]=23;
		rollno2[2]=25;
		rollno2[3]=30;
		
		boolean b1=Arrays.equals(rollno1,rollno2);
		System.out.println(b1);
	}

}

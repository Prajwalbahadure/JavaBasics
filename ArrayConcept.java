package project1;

public class ArrayConcept {

	public static void main(String[] args) 
	{
		int rollno[]=new int[3];
		rollno[0]=50;
		rollno[1]=25;
		rollno[2]=40;
		try
		{
		     rollno[3]=60;
		}
		catch(ArrayIndexOutOfBoundsException r1) 
		{
			
		}
		
		for(int i=0;i<=2;i++) 
		{
			System.out.println(rollno[i]);
		}
		

	}

}

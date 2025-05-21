package project1;

public class Average_No_Array 
{
	public static void main(String[] args) 
	{
		double []rollno1=new double[4];
		rollno1[0]=22;
		rollno1[1]=23;
		rollno1[2]=25;
		rollno1[3]=30;
		double sum=0;
		double average=0;
		
		
		for(int i=0;i<=rollno1.length-1;i++) //can also be written as (int i=0;i<=3;i++)
		{
		sum=sum+ rollno1[i];
		}
		System.out.println(sum);
		average=sum/rollno1.length;
		System.out.println(average);
	}

}

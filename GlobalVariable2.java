package project1;

public class GlobalVariable2 
{
	double pi=3.14;  //instance variable
	static double r=10;
	
	public static void main(String[] args) 
	{
		
		GlobalVariable2 g=new GlobalVariable2();
		double area=g.pi*r*r;
		System.out.println(area);
	}

}

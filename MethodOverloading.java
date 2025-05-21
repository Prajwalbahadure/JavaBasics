package project1;

public class MethodOverloading 
{
    static void add(int a,int b) 
    {
    	System.out.println(a+b);
    }
	static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	void mul(double a,double c) 
	{
		System.out.println(a*c);
	}
	void mul(double a,int b) 
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		add(101,99);
		add(21,0.13);
		MethodOverloading M1=new MethodOverloading();
		M1.mul(2.36, 3.17);
		M1.mul(22.31,5);
	}
}

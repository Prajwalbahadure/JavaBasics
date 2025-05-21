package project1;

public class NonStatic_Parametrized
{

	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void sub(int a,int b,int c) 
	{
		System.out.println(a-b-c);
	}
	void mul(int a,double b, double c)
	{
		System.out.println(a*b*c);
	}
	public static void main(String[] args) 
	{
		NonStatic_Parametrized n=new NonStatic_Parametrized();
		n.add(425, 623, 231);
		n.sub(3456,2001,625);
		n.mul(5, 0.25, 0.125);
	}
}

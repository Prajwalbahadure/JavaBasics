package project1;

public class NonStaticMethod_MultipleMethod 
{

	void add()
	{
		int a=729;
		int b=625;
		System.out.println(a+b);
	}
	void sub()
	{
		int a=729;
		int b=625;
		System.out.println(a-b);
	}
	void mul()
	{
		int a=729;
		int b=625;
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
	
		NonStaticMethod_MultipleMethod n=new NonStaticMethod_MultipleMethod();
		n.add();
		n.sub();
		n.mul();
		
	}
}

package project1;
class C
{
	static void add() 
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
}
class B extends C
{
	static void sub() 
	{
		int a=15;
		int b=6;
		System.out.println(a-b);
	}
}
public class MultiInheritance extends B
{
	static void mul() 
	{
		int a=11;
		int b=6;
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
	}

}

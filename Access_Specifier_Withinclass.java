package project1;

public class Access_Specifier_Withinclass 
{
	public static void add() 
	{
		System.out.println("hello");
	}
	protected static void sub() 
	{
		System.out.println("hello");
	}
	static void mul() 
	{
		System.out.println("hello");
	}
	private static void div() 
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}
}

package project1;

public class Constructor_Overloading 
{

	Constructor_Overloading()
	{
		System.out.println("This is new Constructor.");
	}
	Constructor_Overloading(int a)
	{
		System.out.println(100);
	}
	Constructor_Overloading(double a)
	{
		System.out.println(2.34*2.56);
	}
	public static void main(String[] args) 
	{
		new Constructor_Overloading();
		new Constructor_Overloading(100);
		new Constructor_Overloading(2.17);
	}
}

package project1;

class Super_Calling1 
{

	Super_Calling1()
	{
		System.out.println("This is Parent Constructor");
	}
}
public class Super_Calling extends Super_Calling1
{
	Super_Calling()
	{
		System.out.println("This is Child Constructor");
	}
	public static void main(String[] args) 
	{
		new Super_Calling();
		
	}

}

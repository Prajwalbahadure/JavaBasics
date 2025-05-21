package project1;
class This_Calling1
{
	This_Calling1()
	{
		System.out.println("What is your name?");
	}	
}
public class This_Calling // also called Constructor chaining
{
    This_Calling()
    {
    	this ("Arigato");
    	System.out.println("Prajwal");
    }
    This_Calling(String a)
    {
    	this(100);
    	System.out.println("is");
    }
    This_Calling(int a)
    {
    	this(2.14);
    	System.out.println("name");
    }
    This_Calling(double b)
    {
    	this('a');
    	System.out.println("My");
    }
    This_Calling(char c)
    {
    	super();
    	System.out.println("Hi");
    }
	public static void main(String[] args) 
	{
		new This_Calling();
		
	}
}

package project1;

interface Amazon1
{
	void add();
	void sub();
}
public class Interface_Program implements Amazon1
{
	public static void main(String[] args) 
	{
		Interface_Program i1=new Interface_Program();
		i1.add();
		i1.sub();
	}
    public void add()
	{
		System.out.println("This is interface");
	}
    public void sub() 
	{
    	System.out.println("This is interface");
	}

}

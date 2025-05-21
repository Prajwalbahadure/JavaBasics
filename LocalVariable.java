package project1;

public class LocalVariable 
{
    static void add() 
    {
    	int a=100;
    	int b=200;
  
    	System.out.println(a+b);
    }
    void mul() 
    {
    	int a=25;
    	int b=5;
    	System.out.println(a*b);
    }
	
	public static void main(String[] args) 
	{
		add();
		LocalVariable n=new LocalVariable();
		n. mul();
		
	}
}

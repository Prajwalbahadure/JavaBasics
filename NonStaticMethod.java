package project1;

public class NonStaticMethod 
{
    void addition()
	{
		int a=1000;
		int b=2000;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		
		NonStaticMethod n=new NonStaticMethod();
		n.addition();
	}
}

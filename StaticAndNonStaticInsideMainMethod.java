package project1;

public class StaticAndNonStaticInsideMainMethod 
{

	static void add()
	{
		int a=125;
		int b=49;
		System.out.println(a+b);
	}
	void sub()
	{
	    int c=216;
		int d=64;
		System.out.println(c-d);
	}
	public static void main(String[] args) 
	{
		add();
		StaticAndNonStaticInsideMainMethod n=new StaticAndNonStaticInsideMainMethod();
		n.sub();
	}
}

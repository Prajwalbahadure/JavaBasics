package project1;
public class GlobalVariable3   //assignment 21
{
	int a=10;
	static double b=9.2;
	static void add() 
	{
		GlobalVariable3 g3=new GlobalVariable3();
		g3.a=10;
		System.out.println(g3.a+b);
	}
	void sub() 
	{
		GlobalVariable3 g3=new GlobalVariable3();
		g3.a=10;
		System.out.println(g3.a-b);
				
	}
	public static void main(String[] args) 
	{
		GlobalVariable3 g3=new GlobalVariable3();
		g3.a=100;
		System.out.println(g3.a);
		
		int prajwal=10;
		prajwal=100;
		System.out.println(prajwal);
		
		add();
		GlobalVariable3 g4=new GlobalVariable3();
		g4.sub();
	}

}

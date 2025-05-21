package project1;
interface naruto
{
	void method1();
	void method2();
}
interface saske extends naruto
{
	void method3();
	void method4();
}
public class Multi_Interface implements saske
{

	public static void main(String[] args) 
	{
		Multi_Interface m1=new Multi_Interface();
		m1.method1();
	}
    public void method1()
    {
    	System.out.println("This is multi level interface");
	}
    public void method2() 
    {
		
	}
    public void method3() 
    {
	
	}
    public void method4() 
    {
		
	}
}

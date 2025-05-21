package project1;
abstract class Program3
{
	abstract void add();
	abstract void sub();
	void login() 
	{
		System.out.println("Logic to expose");
	}
	static void logout() 
	{
		System.out.println("Logic to expose");
	}
}
public class Abstract_Concreat extends Program3
{
	public static void main(String[] args) 
	{
		Abstract_Concreat p1=new Abstract_Concreat();
		p1.login();
		logout();
		p1.add();
		p1.sub();
	}
    void add() 
	{
		System.out.println("Logic not to be exposed");
	}
	void sub() 
	{
		System.out.println("Logic not to be exposed");
	}

}

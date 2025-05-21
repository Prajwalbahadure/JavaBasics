package project1;
abstract class Amazon //abstract class
{
	abstract void login();   // abstract method
	abstract void logout();  // abstract method
}
public class Abstract_Method extends Amazon
{
	public static void main(String[] args) 
	{
		Abstract_Method a1=new Abstract_Method();
		a1.login();
		a1.logout();
		
	}
	void login() 
	{
		System.out.println("The real implementation login");
	}
	void logout() 
	{
		System.out.println("The real implementation Logout");
	}
	
}

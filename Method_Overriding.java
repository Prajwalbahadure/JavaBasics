package project1;
class Google_Auth
{
	void login() 
	{
		System.out.println("Login to gmail using mobile no");
	}
}
public class Method_Overriding extends Google_Auth
{
	void login() 
	{
		super.login();
		System.out.println("Login to gmail using Email Id");
	}

	public static void main(String[] args) 
	{
		Method_Overriding m1=new Method_Overriding();
		m1.login();
	}
}

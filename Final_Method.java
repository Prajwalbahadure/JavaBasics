package project1;
class Final_Method1
{
	final void login() 
	{
		System.out.println("Login to gmail using mobile no");
	}
}
public class Final_Method extends Final_Method1
{
	void loginwithemailid()
	{
		System.out.println("Login to gmail using Email Id");
	}

	public static void main(String[] args) 
	{
		Final_Method f1=new Final_Method();
		
		f1.login();
	}
}


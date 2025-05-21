package project1;

class Super_para1
{
	Super_para1(String un,String pwd)
	{
		System.out.println("This is Parent Constructor");
	}
}

public class Super_para extends Super_para1
{

	Super_para()
	{
		super("Prajwalbahadure5@gmail.com","Prajwal");
		System.out.println("This is Child Constructor");
	}
	public static void main(String[] args) 
	{
		new Super_para();
	}
}

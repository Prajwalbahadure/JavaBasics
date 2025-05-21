package project1;

public class GlobalVariable 
{
	static int a=100;  //global variable
	static int b=200;
   static void addition()
    {
    	System.out.println(a+b);
    }
   static void subtraction()
   {
	   System.out.println(a-b);
   }
   static void multiplication()
   {
	   System.out.println(a*b);
   }
	public static void main(String[] args) 
	{
		addition();
		multiplication();
		subtraction();
	}
}

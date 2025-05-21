package project1; //calling static method inside main method

public class ArithmaticOperators {

	static void add() 
	{
		int a=20;
		int b=60;
		int sum=a+b;
		System.out.println(sum);
			}
	static void sub() 
	{
		int a=80;
		int b=60;
		int sub=a-b;
		System.out.println(sub);
			}
	static void mul() 
	{
		int a=20;
		int b=60;
		int mul=a*b;
		System.out.println(mul);
			}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		
	}
}

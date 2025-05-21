package project1;

public class StaticmethodParametrized 
{
	static void add(int a,int b) 
	{
		int sum=a+b;
		System.out.println(sum);
    }
	static void mul(int a,int b,int c) 
	{
		int mul=a*b*c;
		System.out.println(mul);
	}
	static void tagline(String name) 
	{
	    System.out.println("Just Do It");
	}
	static void sum(int a, int b,double c,char d,String name,boolean answer) 
	{
		System.out.println(a+b+c+d+name+answer);
	}
	public static void main(String[] args) 
	{
		add(10,20);
		mul(12,13,14);
		tagline("Nike");
		sum(25,2,3.17,'X',"amr",true);
	}
}

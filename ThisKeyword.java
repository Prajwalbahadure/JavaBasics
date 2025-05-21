package project1;

public class ThisKeyword 
{
	String name;
	double salary;
	int age;
	void student_details(String name,double salary,int age) 
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
		System.out.println("Hi my name is ->"+name);
		System.out.println("My salary is ->"+salary);
		System.out.println("My age is ->"+age);
	}
	public static void main(String[] args)
	{
		ThisKeyword t1=new ThisKeyword();
		t1.student_details("Prajwal",89000,25);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		System.out.println(t1.age);
	}

}

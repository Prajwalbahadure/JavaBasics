package project1;

public class ReverseAString {

	public static void main(String[] args) 
	{
		String input="Prajwal";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) 
		{
			char c1=    input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.print(reverse);   
	}

}

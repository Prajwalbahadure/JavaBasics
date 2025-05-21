package project1;

public class StringPalandrome {

	public static void main(String[] args) 
	{
		String input="mom";
		String reverse="";
		
		
		for(int i=input.length()-1;i>=0;i--) 
		{
			char c1=    input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		if(input.equals(reverse)) 
		{
			System.out.println("They are Palandrome");
			
		}
		else 
		{
			System.out.println("Not Palandrome");
		}

	}

}

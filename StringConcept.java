package project1;

public class StringConcept 
{
	public static void main(String[] args) 
	{
		String a="stark";
		String b="LANESTER";
	
		      System.out.println(b.toLowerCase());
		        System.out.println(a.toUpperCase());
		int a1=  a.length(); // length always start from 1,2...
		System.out.println(a1);
		String d="JOHN SNOW";
		       System.out.println(d.charAt(5)); //Indexing starts from 0,1..
		String c="      winter is comming";
		System.out.println(c);
		System.out.println(c.trim());              //trim will only remove extra space from the front end and back end of the string but not in the middle
		       
		
	}

}


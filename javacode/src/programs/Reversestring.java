package programs;

public class Reversestring 
{
public static void main(String[] args)
{
	String s="Ajay";
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	//System.out.println(s.length());
	System.out.println(s);
	System.out.println(s1);
	
	
	
}
}
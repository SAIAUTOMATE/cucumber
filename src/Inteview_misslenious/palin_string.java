package Inteview_misslenious;

import java.util.Scanner;

public class palin_string {
	public static void main(String[] args) {
		
	System.out.println("value entr cheyra: ");

Scanner sc= new Scanner(System.in);

String rev ="";
		String s=sc.next();
		int len=s.length()-1;
		String original=s;
for(int i=len;i>=0;i--)
{
	
	rev=rev+s.charAt(i);
	
}

	System.out.println("revese value is "+rev);

	if(original.equals(rev))
		
	{
		System.out.println(" palind");

	}
	else
	{
		System.out.println("not palind");
		
	}
}
}
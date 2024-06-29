package Inteview_misslenious;

import java.util.Scanner;

public class reverse_string {
	public static void main(String[] args) {
		System.out.println("value entr cheyra: ");

Scanner sc= new Scanner(System.in);

String rev ="";
		String s=sc.next();
		int len=s.length()-1;
for(int i=len;i>=0;i--)
{
	
	rev=rev+s.charAt(i);
	
}

	System.out.println("revese value is "+rev);

StringBuffer sb=new StringBuffer(s);
System.out.println("buufer revese is"+sb.reverse());
	
	
	}
}

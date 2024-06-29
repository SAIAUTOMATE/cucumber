package Inteview_misslenious;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

	int num=sc.nextInt();
		int orginal_num=num;
		int rev=0;
		
		while(num!=0)
	
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if(orginal_num==rev)
		{
	System.out.println("super palindrome");	
	}
		else
		{
			System.out.println("super not palindrome");	

			
		}
		
		}

}

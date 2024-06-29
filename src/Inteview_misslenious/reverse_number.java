package Inteview_misslenious;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);

	System.out.print("Enter a number:");
	int num= sc.nextInt();
	
/*	int rev=0;
	
	while(num!=0)
		{
		rev= rev*10+num%10;
		num= num/10;
		
		}
	
	
	System.out.println("rev number is "+rev);
	
	*/
	//String buffer class:
	
	//StringBuffer rev2;
	
	StringBuffer sb= new StringBuffer(String.valueOf(num));
	StringBuffer rev2=sb.reverse();
	System.out.println(rev2);
	
	}

}

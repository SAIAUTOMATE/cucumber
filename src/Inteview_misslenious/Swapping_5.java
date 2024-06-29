package Inteview_misslenious;

public class Swapping_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
System.out.println("before swap a:"+a+" and b:"+b);
	
	//thirdvariable

int c=a;
	a=b;
	b=c;
	System.out.println("swapped a :"+a+"and b:"+b);

	//+ and - no third variable
	
	
	int x=10;
	int y=20;
	x= x+y;// 10+20--30
	y=x-y;// 30-20 --10
	x=x-y;//30-10 --2
	
	System.out.println("swapped x :"+ x+"and y:"+y);
	

	int m=10;
	int n=20;
	n=m+n-(m=n);
	System.out.println("swapped m :"+ m+"and n:"+n);

	}

}

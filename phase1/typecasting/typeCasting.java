package typecasting;

import java.util.Scanner;

public class typeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type Conversion");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character :");
		char a=sc.next().charAt(0);
		
		System.out.println("Value of a is:"+a);
		int b=a;
		System.out.println("Value of b is:"+b);
		float c=a;
		System.out.println("Value of c is:"+c);
		long d=a;
		System.out.println("Value of d is:"+d);
		double e=a;
		System.out.println("Value of e is:"+e +"\n");
		System.out.println("Explicit Type Conversion :");
		
		double x=sc.nextDouble();
		int y=(int)x;
		float z=(float)x;
		long w=(long)x;
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
		System.out.println("Value of z:"+z); 	
		System.out.println("Value of z:"+w); 
	}

}




package javaprogrammes;

import java.util.Scanner;

public class NestedIfEg {

	public static void main(String[] args) 
	{
//		int a=4000;
//		int b=30000;
//		int c=100000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("Enter c value");
		int c=sc.nextInt();
		
		
		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > a & b > c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}

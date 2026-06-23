package morning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) //throws InterruptedException
	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//			Thread.sleep(500);
//		}
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("eligible for voting.. ");
		}
		else
		{
//			System.out.println("not eligible");
			throw new NullPointerException("not eligible");
		}
		
		
//		System.out.println("hello");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=a/b;
//		System.out.println(c);
//		System.out.println("java");
		//ArithmeticException
		//InputMismatchException
		
//		int a[]=new int[3];
//		a[0]=45;
//		a[1]=65;
//		a[2]=3;
//		a[3]=78;
//		System.out.println(a[2]);
		//ArrayIndexOutOfBoundsException
		
//		String a="JAva";
//		System.out.println(a.charAt(4));
		//StringIndexOutOfBoundsException
		
//		String s=null;
//		System.out.println(s.charAt(0));
		///NullPointerException
		
		
//		System.out.println("hello");
//		Scanner sc=new Scanner(System.in);
//		try
//		{
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int c=a/b;
//			System.out.println(c);
//			
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//		catch(InputMismatchException e1)
//		{
//			System.out.println(e1);
//		}
//		finally
//		{
//			System.out.println("java");
//		}
		
//		Scanner sc=new Scanner(System.in);
		
		
	}
/*
 * Error
 * 1.compile time error
 * 2.Runtime error/Exception
 * 3.Logical Error
 */
}

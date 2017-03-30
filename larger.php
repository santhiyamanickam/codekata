import java.util.*;
import java.lang.*;
import java.io.*;
class larger
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		System.out.println("Enter the number:");
	     if(a>b)
	     {
	     	System.out.println("a is larger");
	     }
	     else
	     if(b>c)
		{
			System.out.println("b is larger");
		}
		else
		{
			System.out.println("c is larger");
		}
	}
}

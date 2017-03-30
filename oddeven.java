import java.util.*;
import java.lang.*;
import java.io.*;
class oddeven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("Enter the number:");
	     if(a%2==0)
	     {
	     	System.out.println("Even number");
	     }
	     else
		{
			System.out.println("odd number");
		}
	}
}

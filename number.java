import java.util.*;
import java.lang.*;
import java.io.*;
class number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("Enter the number:");
	     if(a==0)
	     {
	     	System.out.println("Equal to zero");
	     }
	     else
		if(a<0)
		{
			System.out.println("Negative number");
		}
		else
			{
			System.out.println("Positive number");
		}
		
		
	}
}

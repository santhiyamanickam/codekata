import java.util.*;
import java.lang.*;
import java.io.*;

class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int f=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=in.nextInt();
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("Not a prime number:");
			    f=1;
			    break;
			}
				if(f==0)
				{
				System.out.println("prime number");
			}
		}
	}	
}
	

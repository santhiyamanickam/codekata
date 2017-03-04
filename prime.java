import java.util.*;
import java.lang.*;
import java.io.*;

class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,n,r=0,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=in.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			r=r*10+a;
			n=n/10;
			System.out.println(r);
		}
		if(temp==r)
		{
		System.out.println("This is palindrome number");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		}
	}

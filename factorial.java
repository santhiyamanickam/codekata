import java.util.*;
import java.lang.*;
import java.io.*;
class factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int fact=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

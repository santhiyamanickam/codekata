import java.util.*;
import java.lang.*;
import java.io.*;
class revint
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,r=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the integer");
		int n=in.nextInt();
		while(n>0)
		{
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		System.out.println(r);		
	}
}

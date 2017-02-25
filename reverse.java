import java.util.*;
import java.lang.*;
import java.io.*;
class reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n;
		String a,c="";
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		n=a.length();
		for(i=n-1;i>=0;i--)
		{
			c=c+a.charAt(i);
		}
		System.out.println(c);
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;
class swapevenodd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int odd=in.nextInt();
		System.out.println("Enter the odd number:");
		int even=in.nextInt();
		System.out.println("Enter the even number:");
		odd=odd+even;
		even=odd-even;
		odd=odd-even;
		System.out.println("odd:"+odd);
		System.out.println("even:"+even);
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;


class sumofnatural
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int a, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        while(i <= a)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+a+" numbers is :"+sum);
    } 
}

import java.util.ArrayList;
import java.util.Scanner;
public class Subset1 {
public static void main(String [] args)
{
	int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array1");
ArrayList<Integer> u= new ArrayList<Integer>();
int n=sc.nextInt();
int []a=new int[n];
	for(int i=0;i<n;i++)
	{
		u.add(sc.nextInt());
	}
	System.out.println("enter the length of array2");
int m=sc.nextInt();
int []b=new int[m];
	for(int i=0;i<m;i++)
	{
		b[i]=sc.nextInt();
	}
	
		for( int i=0;i<m;i++)
	{
		if(u.contains(b[i]))
		{
			c++;	
		}
		if(m==c)
		{
			System.out.println("this subset of a1");	
		}
	}
}
}

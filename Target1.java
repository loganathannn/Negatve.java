import java.util.Scanner;
public class Target1{
public static void main(String [] args)
{
	int g=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of values in array");
	int n=sc.nextInt();
	int [] a=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("target element");
	int t=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		g=g+a[i];
	}
	if(g==t)
	{
		System.out.println("True");
	}
	else
		System.out.println("false");
}
}

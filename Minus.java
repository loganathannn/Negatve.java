import java.util.Scanner;
public class minus {
public static void main(String[] args)
{
	int max=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number value in array");
	int n=sc.nextInt();
	int[] a=new int[n];
	int[] p=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int j=0;j<n-1;j++)
	{
		int k=Math.abs(a[j]-a[j+1]);
		p[j]=k;
	}
		max=p[0];
for(int i = 0;i<n;i++)
{
	if(p[i]>max)
	{
		max=p[i];
	}}
System.out.println(" Maximum difference between two numbers in the array"+max);
}
}

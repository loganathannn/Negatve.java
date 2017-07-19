import java.util.Scanner;
public class Inttobinary {
	public static void main (String[] args)
	{
		System.out.println("enter the word");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	System.out.println( Integer.toBinaryString(a[i]));
}}
}

import java.util.Scanner;
public class Mk {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		int n=sc.nextInt();
while(n!=0)
{
	for(int i=0;i<n;i++)
	{
		System.out.print("*");
	}
	System.out.print(" ");
		for(int i=0;i<n;i++)
		{
			System.out.print("*");	
	}
		System.out.println(" ");
		n--;
		}
}
}

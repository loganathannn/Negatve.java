import java.util.Scanner;
public class Subset {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.next();
	String b=a.substring(0,1);
	System.out.println("enter the length");
	int n1=sc.nextInt();
	int i=0,n;
	for(i=1,n=n1;i<a.length()-n1+2;i++,n++)
	{	
			String g=a.substring(i,n);
	System.out.println(b +""+ g);
}
}}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Oddreverse {
public static void main(String []args) throws IOException
{
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("enter the string");
	String a=sc.readLine();
	String[] b=a.split(" ");
	int i=0;
	for(i=0;i<b.length;i++)
	{
		String g="";
		char[] c=b[i].toCharArray();
	if(i%2==0)
	{
		for(int j=c.length-1;j>=0;j--)
		{
			g+=c[j];
		}
		
	}
	else 
	{
		g=b[i];
	}
System.out.print(g+" ");
}
}}


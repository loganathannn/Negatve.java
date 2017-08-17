import java.util.Scanner;
public class Pow1 {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int g=0;
	double b=0,c=0;
	System.out.println("Enter the value");
	String s=sc.next();
char []f=s.toCharArray();

	for(int i=0;i<s.length();i++)
	{	
		int v=f[i]-48;	

		//System.out.println("a="+v);
		 b=Math.pow (v,i);
		// System.out.println("b="+b);
		 c=b+c;
	 g=(int) c;
		 
	}
	System.out.println(g);
}
}

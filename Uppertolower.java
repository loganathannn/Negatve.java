import java.util.Scanner;
public class Uppertolower {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.next();
	char [] b=a.toCharArray();
	for(int i=0;i<a.length();i++)
		
	{
		if(Character.isLowerCase(b[i]))
		{
			System.out.print(Character.toUpperCase(b[i]));
		}
		else 
			{
				System.out.print(Character.toLowerCase(b[i]));
			}
	}
}
}

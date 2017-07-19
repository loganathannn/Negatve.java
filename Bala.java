import java.util.Scanner;
public class Bala {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.next();
	int b=a.length();
if(b%2==0)
{
	System.out.print(a + " is  balanced ");
}
else
System.out.print(a + " is not balanced");
}
}

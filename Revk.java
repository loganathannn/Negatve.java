import java.util.Scanner;
public class Revk {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
String a=sc.nextLine();
	String[] b=a.split(" ");
System.out.print(b[1]  +" "+  b[0]);
	}
}


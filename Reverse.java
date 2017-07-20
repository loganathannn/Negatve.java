import java.util.Scanner;
public class Reverse {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
String a=sc.nextLine();
	String[] b=a.split(" ");
	for(String bb:(b))
	{
		StringBuffer br=new StringBuffer(bb);
br.reverse();
System.out.print(br+" ");
	}
}
}

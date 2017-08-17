import java.util.Scanner;
public class Palirem {
public static void main(String [] args)
{
	String temp=" ";
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0;i<s.length();i++)
		{
		temp =s.substring(0,i)+s.substring(i+1);
		StringBuffer br=new StringBuffer(temp);
		br.reverse();
		String d=String.valueOf(br);
	if(temp.equalsIgnoreCase(d))
		{
	char c=s.charAt(i);
		System.out.println("remove the character "+ c +" the string should become a palidrome" );
		}
	}
	}
}


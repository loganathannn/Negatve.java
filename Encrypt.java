import java.util.Scanner;
public class Encrypt {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the string");
	String a=sc.next();
	int i=0;
	char[] b=a.toCharArray();
for(i=0;i<a.length();i++){
		if(b[i]=='a') 
	{
		System.out.print("z");
	} 
	else
		System.out.print((char) (b[i]-1));
}
}
}

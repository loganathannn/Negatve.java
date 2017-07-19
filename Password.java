import java.util.Scanner;
public class Password {
public static void main(String[] args)
{ int sum=0,n;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the values");
	String a=sc.next();
	int w=a.length();
String j=a.substring(0,1).toLowerCase();
String g=a.substring(w-1);
	int b=sc.nextInt();
	String d=String.valueOf(b);
	int c=0,e=0;
	if(d.length()>=3)
	{
	  c = b/100;
	e=c%10;
	System.out.print(e);
	}
	else
	{
		e=b/100;
		System.out.print(e);
	}
	System.out.print(j);
   while(b >0)
    {
        n = b % 10;
        sum = sum + n;
        b = b / 10;
    }
  int y=sum%10;
  if(y==0){
	  y=sum/10;
  }
   n=sum/10;
   int q=y+n;
   System.out.print(q);
	System.out.print(g);
}
	}


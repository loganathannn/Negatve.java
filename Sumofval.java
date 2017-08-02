import java.util.*;
public class Sumofval
{
    public static void main(String[] args)
    {
        int c=0,b=0,sum=0,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
 Integer a=sc.nextInt();
String s=String.valueOf(a);
 char[] d=s.toCharArray();
int n=d.length;
if(a<10)
{    
    System.out.println("Enter a value greaterthan 9");
    System.exit(0);
}
else
{
    for(int i=0;i<n;i++)
    {
        int b1=a;
       for(int j=0;b1!=0;j++) 
       {
           p=b1%10;
           b1=b1/10;
       sum=sum+p;
       }
       a=a/10;
    } 
}
    System.out.println("The sum of digits is:"+sum);

    }
}

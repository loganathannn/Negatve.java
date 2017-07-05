import java.util.*;
public class Large
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in); 
    int a=sc.nextInt();
    int b=sc.nextInt();  
    int c=sc.nextInt();  
    int d;  
    if(a>b){
      d=a;
    }
    else
    {
    d=b;}
    if(c>d)
    {
      d=c;
    }
    System.out.println("the largest number is"+d);  
  }
}

import java .util.*;
public class Reverse4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers");   
    String a=sc.next();
    StringBuffer b=new StringBuffer(a);
    b.reverse();
    System.out.println(b);
  }
}
  

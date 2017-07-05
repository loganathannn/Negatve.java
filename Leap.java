import java.util.*;
public class Leap
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in); 
    int a=sc.nextInt();
    if(a%4==0)
    {
      System.out.println("is leap year");  
      }
      else {
        System.out.println("is not a leap year");  
      } 
    }
  }

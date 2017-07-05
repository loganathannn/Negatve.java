import java.util.*;
public class Sum
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int a=0,d,sum=0;
    for(int i=0;n>0;i++)
    {
      d=n%10;
      sum=sum+d;   
      n=n/10;
       
    }
    System.out.println("the sum of digits"+sum);  
    
    
  }
}

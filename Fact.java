import java.util.*;
class Fact 
{
    public static void main(String args[]) {
    int i,n;
    int f=1;  
    Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
    for(i=1;i<=n;i++) 
    f=f*i;
    
    System.out.println("factorial is "+f);
    }
}


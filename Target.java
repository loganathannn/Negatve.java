import java.util.*;
public class Repeat{

public static void main(String[] args) 
    {
 
         Scanner s=new Scanner(System.in);
        int t;int f=0;
      
        System.out.println("enter array of elements");
        int d=s.nextInt();
        int[] ab=new int[d];
        for(int i=0;i<d;i++)
        {
            ab[i]=s.nextInt();
        }
        System.out.println("enter ur target number"); 
        t=s.nextInt();
          for(int i=0;i<d;i++)
          {
         for(int j=i;j<d;j++)
         {
             if(ab[i]+ab[j]==t)
            {  
            	 f++;
            	 
                System.out.println(ab[i]+"+ "+ab[j]+"= "+t);}
    
         }}
        if(f==0)
              System.out.println("no numbers in array will give target while adding");
}}

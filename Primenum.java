package c;

 import java.util.*;
 public class Primecount
 {
     public static void main(String[] args)
     
     {
        int  flag=0,c=0,k=0,j,i;
   Scanner sc=new Scanner(System.in);
       System.out.println("Enter the starting number:");
       int st=sc.nextInt();
       System.out.println("Enter the ending number:");
       int end=sc.nextInt();
   int []v=new int[5000];

      for( i =st; i <= end; i++)
         {
             for(  j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
           
             }
         
             if(flag==1)
             {
 
            v[k]=i;
            System.out.println(i);
            k++;
            
               
          } 
             
         }}
 }
   
           
             
             
           

 

import java.util.Scanner;
public class Curreny {
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a=sc.nextInt();
int c=0,d=0,b=0,u=0,v=0,i=0,l=0,q;
if(a>=500)
{		
	b=a/500;
	int c1=a-500;
	c1=c1/100;
u=a%100 ;
int k=u-50;
int  u1=u/50;
		 if((k<50))
			 i=k/10 ;
		 if((u>10)&&(u<50))
		 {
			i=u/10; 
		 }
			 l = u%10;
			 if(l<10)
	 v=(b+l+i+c1+u1);
			 if(v<0)
			 {
				 v=v+5;
			 }
	System.out.println(v+" currency ");
	}
int v1=0;

if(a<500)
{
	q=a/100;
			 if(q==0)
			 {
				 System.out.println(q);
			 }
			 else
			 {
			 u=a%100 ;
	
			int k=u-50;
			int  u1=u/50;
					 if((k<50))
						 i=k/10 ;
					
					 if((u>10)&&(u<50))
					 {
						i=u/10; 
					 }
						 l = u%10;
						 if(l<10)
					
				 v=(q+l+i+u1);int j=0;
				
						 if(v<0)
						 {
							 v=v+5;
						 }
						
				System.out.println(v+" currency ");
			 }
}
}}

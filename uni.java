package c;
import java.util.Arrays;
import java.util.Scanner;
public class uni {
	 public static void main(String[] args)
	 {
	   int c=0;
	   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int[] Arr=new int[n];
	   uni obj=new uni();
	   System.out.println("ENTER THE ELEMENTS:");
	   for(int i=0;i<n;i++)
	    {
	     Arr[i]=s.nextInt();
	    }
	    Arrays.sort(Arr);
	   System.out.println("UNIQUE ELEMENT:"+obj.lo(Arr,n));
	 } 

	 public int lo(int[] Arr,int n)
	   {
	     int t=0,c=0;
	    for(int i=0;i<n-1;i+=2)
	     {
	       if(Arr[i]!=Arr[i+1])
	         {  
          t=Arr[i];
	          c=1;
	          break;
	         }
	    }
	    if(c==0)
	    {
	    t=Arr[Arr.length-1];
    }
	      return t;
	  }
	}        


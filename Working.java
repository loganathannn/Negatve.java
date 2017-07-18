import java.util.Scanner;
public class Working {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day");
	String a=sc.nextLine();
		    if((a.equalsIgnoreCase("sun"))||(a.equalsIgnoreCase("sat")))
		    {
		    	System.out.print("false");
		    }
		    else if((a.equalsIgnoreCase("mon"))||(a.equalsIgnoreCase("tue"))||(a.equalsIgnoreCase("wed"))||(a.equalsIgnoreCase("thu"))||(a.equalsIgnoreCase("FRI")))
		    {
				    	System.out.print("True");
				    }
		    else
		    	System.out.print("only print days");
		    }
	}



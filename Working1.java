import java.util.Scanner;
public class Working1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day");
	String a=sc.nextLine();
		    if((a.equalsIgnoreCase("sunday"))||(a.equalsIgnoreCase("saturday")))
		    {
		    	System.out.print("false");
		    }
		    else if((a.equalsIgnoreCase("monday"))||(a.equalsIgnoreCase("tuesday"))||(a.equalsIgnoreCase("wednesday"))||(a.equalsIgnoreCase("thursday"))||(a.equalsIgnoreCase("FRIday")))
		    {
				    	System.out.print("True");
				    }
		    else
		    	System.out.print("only print days");
		    }
	}



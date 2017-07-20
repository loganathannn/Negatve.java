
import java.util.Scanner;
import java.util.TreeSet;
public class Pan {
public static void main(String[] args)
	{  
	Scanner sc=new Scanner (System.in);
	TreeSet<Character> td=new TreeSet<Character>(); 
		System.out.print("Enter");
		String a=sc.nextLine();
		String b=a.toLowerCase().replace(" ","");
		for (int j=0;j<b.length();j++)
		{
			char n=b.charAt(j);
			td.add(n);
		}
	if(26==td.size()){
		System.out.println("pangram");
	}
		else
			System.out.println("not pangram");	
		}
		}
		



		
	

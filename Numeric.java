import java.util.Scanner;
public class Numeric {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int d=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'
					 ||s.charAt(i)=='.' ||s.charAt(i)=='e'||s.charAt(i)=='E') {
				d++;
			}
		}
		if(d==s.length()){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}

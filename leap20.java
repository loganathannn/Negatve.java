import java.util.Scanner;
public class leap20 {
public static void main(String [] args){
	System.out.println("Enter the year");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=0;
	for(int i=n;i<n+80;i++)
	{
		if(i%4==0)
			System.out.println("leap year"+i);
	}
}
}

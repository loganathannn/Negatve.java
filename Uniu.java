import java.util.Scanner;
public class Uniu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int i,j;
		char out[]=new char[n];
		for(i=0;i<n;i++) {
			out[i]=sc.next().charAt(0);
		}
		int g=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(out[i]==out[j] && i!=j) {
				g++;
					break;
				}
			}
			if(g==0) {
				System.out.print(out[i]+" ");
			}
			g=0;
		}
	}
}

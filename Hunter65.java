import java.util.Scanner;
public class Hunter65 {
    public static void main(String[] args) { 
        Scanner in=new Scanner(System.in);
        System.out.println("pls enter the size of an array:-->");
        int n=in.nextInt();
        int num[]=new int[n];
        for(int k=0;k<num.length;k++)
        {
            num[k]=in.nextInt();
        }
        System.out.println("Enter the number to be delete:-->");
        int m=in.nextInt();
        for(int p=0;p<num.length-1;p++)
        {
            if(m==num[p])
            {
                  num[p]=num[p+1];      
             }
        }
        for(int k=0;k<num.length-1;k++)
            System.out.println(num[k]);
    }

}

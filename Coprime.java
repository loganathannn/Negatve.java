import java.io.*;
class Coprime
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the First no : ");
            int n1=Integer.parseInt(br.readLine());
            System.out.print("Enter the Second no : ");
            int n2=Integer.parseInt(br.readLine());
            int h=0;
            int min = Math.min(n1,n2);
             
            for(int i=min; i >= 1; i--)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    h = i;
                    break;
                }
            }     
            if(h==1)
            {
            	System.out.println("it is coprime");
            }
            else
            {
            	System.out.println("it is not coprime");
            }
        }
    }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Repeatall {
public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int co=0;
			System.out.println("Enter the String");
			String s=br.readLine();
			int l=s.length();
			char c[]=s.toCharArray();
			for(int i=0;i<l;i++){
				co=0;
					for(int j=0;j<l;j++){
						if(c[i]==c[j])
							co++;
					}
					if(co==1)
						System.out.print(c[i]);
			}
		}
	}



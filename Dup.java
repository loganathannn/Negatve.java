import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dup {
public static void main(String args[])throws IOException{
	char c;
	String ans="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("uujxch");
	String s=br.readLine();
	int l=s.length();
	for(int i=0;i<l;i++)
	{
	c=s.charAt(i);
	if(c!=' ')
	ans=ans+c;
	s=s.replace(c,' ');
	}
	System.out.println(ans);
	}
	}



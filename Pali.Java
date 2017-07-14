import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pali {
public static void main(String[] args)throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String s1 = br.readLine();
    int n = s1.length();
  StringBuffer sb = new StringBuffer(s1);
  String ans=sb.reverse().toString();
    //System.out.println(ans);  
    System.out.println(sb);
  
  if(s1.equals(ans))
    System.out.println("Given string is Palindrome");
  else
    System.out.println("Given string is not Palindrome");
}
}

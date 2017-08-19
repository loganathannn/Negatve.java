import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Dort {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer>List=new ArrayList<Integer>();
	System.out.println("no of students");
	int n=sc.nextInt();
	int m=n*6;
	float sum=0;
	int m1[]=new int[n];
	int m2[]=new int[n];
	int s1[]=new int[n];
	int s2[]=new int[n];
	int s3[]=new int[n];
	int s4[]=new int[n];
	for(int i=0;i<n;i++){	
		System.out.println("enter the mark in m1 " +(i+1));
		 m1[i]=sc.nextInt();
			System.out.println("enter the mark in m2 " +(i+1));
		 m2[i]=sc.nextInt();
			System.out.println("enter the mark in s1 " +(i+1));
		 s1[i]=sc.nextInt();
			System.out.println("enter the mark in s2 " +(i+1));
		 s2[i]=sc.nextInt();
		 System.out.println("enter the mark in s3 " +(i+1));
	 s3[i]=sc.nextInt();
	 System.out.println("enter the mark in s4 " +(i+1));
		 s4[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	List.add(m1[i]);
	List.add(m2[i]);
	List.add(s1[i]);
	List.add(s2[i]);
	List.add(s3[i]);
	List.add(s4[i]);
	Collections.sort(List);
	}
	for(int h=0;h<List.size();h++)
	{
		sum=sum+List.get(h);
	}
	System.out.println(sum/(List.size()));
}}

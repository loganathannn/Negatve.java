package guvimin;

import java.util.Scanner;

public class Guvi1 
{
    int minDist(int arr[], int n, int x, int y) 
    {
        int i, j;
        int min_dist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if ((x == arr[i] && y == arr[j]
                    || y == arr[i] && x == arr[j])
                    && min_dist > Math.abs(i - j)) 
                    min_dist = Math.abs(i - j);
            }
        }
        return min_dist;
    }
 
    public static void main(String[] args) 
    {
        guvi1 min = new guvi1();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[] =new int[a];
        for(int i=0;i<a;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int n = arr.length;
        System.out.println("enter the finding number");
        int x =sc.nextInt();
        int y = sc.nextInt();
 
        System.out.println("Minimum distance between " + x + " and " + y 
                + " is " + min.minDist(arr, n, x, y));
    }
}

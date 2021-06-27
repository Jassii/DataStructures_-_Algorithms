import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int n = 8;
		int arr[] = {2,4,1,3,6,7,8};
		int tot = (n*(n+1))/2;  //this will return the sum of natural numbers till n.
		int i;
    //subtract each value of the array from the tot..at last the missing value be there in the tot variable..
		for(i=0;i<arr.length;i++)
		{
		    tot = tot-arr[i];
		}
		System.out.println("The number missing from the unsorted array is "+tot);
	}
}

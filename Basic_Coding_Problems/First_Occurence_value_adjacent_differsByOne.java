import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {7,6,7,6,5,4};
	    int val=4;
	    System.out.println(searchBruteForce(arr,val));
	    System.out.println(searchOptimized(arr,val));
	    
	}
	public static int searchBruteForce(int arr[],int val)
	{
	    if(arr.length==0)
	    {
	        return -1;
	    }
	    int i;
	    for(i=0;i<arr.length;i++)
	    {
	        if(arr[i]==val)
	        {
	            return i;
	        }
	    }
	    return -1;  //when value is not there..
	}
	
	public static int searchOptimized(int arr[],int val)
	{
	    if(arr.length==0)
	    {
	        return -1;
	    }
	    int i=0;
	    while(i<arr.length)
	    {
	        if(arr[i]==val)
	        {
	            return i;
	        }
	        else
	        {
	            int dif = Math.abs(arr[i]-val);
	            i = i+dif;
	        }
	    }
	    return -1;
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {70,60,70,80,90,110,130};
	    int val=110;
	    int K=20;
	    //System.out.println(searchBruteForce(arr,val,K));
	    System.out.println(searchOptimized(arr,val,K));
	    
	}
  //brute force approach.
	public static int searchBruteForce(int arr[],int val,int k)
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
	
  //optimized approach..
	public static int searchOptimized(int arr[],int val,int k)
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
	            int dif = Math.abs(arr[i]-val)/k;  //dividing by k..
              dif = Math.max(1,dif);  //Atleast they should move by one position.. {70,70,60,70,80,90,110,130};
	            i = i+dif;
	        }
	    }
	    return -1;
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {12,3,5,1,9};
	    int sum=10;
	    System.out.println(sortBruteForce(arr,sum));
	    System.out.println(sortTech(arr,sum));
	    System.out.println(sortHashing(arr,sum));
	}
	
	public static boolean sortBruteForce(int arr[],int sum)
	{
	    int i,j;
	    
	    if(arr.length==0)
	    {
	        return false;
	    }
	    
	    for(i=0;i<arr.length-1;i++)
	    {
	        for(j=i+1;j<arr.length;j++)
	        {
	            if(arr[i]+arr[j]==sum)
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	public static boolean sortTech(int arr[],int sum)
	{
	    if(arr.length==0)
	    {
	        return false;
	    }
	    
	    //sort the Array.
	    Arrays.sort(arr);  //this will sort the array.
	    
	    //now taking two variables.
	    int start=0; //starting index.
	    int end=arr.length-1;  //ending index..
	    
	    while(start<=end)
	    {
	        int s = arr[start] + arr[end];
	        if(sum<s)
	        {
	            end--;
	        }
	        else if(sum>s)
	        {
	            start++;
	        }
	        else
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean sortHashing(int arr[],int sum)
	{
	    if(arr.length==0)
	    {
	        return false;
	    }
	    
	    Set<Integer> set = new HashSet<>();  //creating a set.
	    int i;
	    for(i=0;i<arr.length;i++)
	    {
	        if(set.contains(sum-arr[i]))
	        {
	            return true;
	        }
	        else
	        {
	            set.add(arr[i]);
	        }
	    }
	    return false;
	}
}

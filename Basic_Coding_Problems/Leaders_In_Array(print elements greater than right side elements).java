import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int arr[] = {14,15,8,9,5,2};  //given array..
		
		//////////////////////////////////////////////////////////////////////////////////////
		//One method..but it takes O(n^2) time.. to solve this..
		/*
		int i,j;
		for(i=0;i<arr.length;i++)
		{
		    j=i+1;
		    while(j<arr.length)
		    {
		        if(arr[i]<arr[j])
		        {
		           break;
		        }
		        j++;
		    }
		    
		    if(j>=arr.length)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}*/
		/////////////////////////////////////////////////////////////////////////
		//Another method to solve this question much efficiently.
		int i;
		int max=Integer.MIN_VALUE;
		for(i=arr.length-1;i>=0;i--)
		{
		    if(arr[i]>max)
		    {
		        max = arr[i];
		        System.out.print(max+" ");
		    }
		}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int arr[] = {1,6,7,0,7};
		if(arr.length==0)  //if the length is 0..then return -1..
		{
		    System.out.println(-1);
		}
    
		int i;
		int tot_sum=0;
		//calculating the total sum..
		for(i=0;i<arr.length;i++)
		{
		    tot_sum = tot_sum+arr[i];
		}
    //calculating the sum so far..
		int sum_so_far=0; 
		for(i=0;i<arr.length;i++)
		{
		    tot_sum = tot_sum-arr[i];   //subtract the value from the tot_sum..
		    if(tot_sum==sum_so_far)  //if the sum is equal to the sum_so_far...then print the equilibrium index..
		    {
		        break;
		    }
		    sum_so_far = sum_so_far+arr[i];   //if it is not..then add that value to the sum_so_far.
		}
		System.out.println("Equilibrium point is "+i);  //print the index..  
	}
}

import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {-3,-4,4,-1,-2,1,5,-3};
	    int i;
    
	    int max_so_far=arr[0];  //maximum till now.
	    int current_max=arr[0]; //current maximum element..
	    
	    for(i=1;i<arr.length;i++)
	    {
	        current_max = Math.max(current_max+arr[i],arr[i]);
	        max_so_far = Math.max(current_max,max_so_far);
	    }
    
	    System.out.println("Maximum length of the contigous subarray is "+max_so_far);
	}
}

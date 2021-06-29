import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[] = {2,3,4,4,3,5,7};
	    
	    //take a set..
	    Set<Integer> set = new HashSet<>();
	    int i;
	    int first_repeat=-1;
    
    //traverse from the end..
	    for(i=arr.length-1;i>=0;i--)
	    {
	        if(set.contains(arr[i]))  //if value is there..simply update the value of the last_repeat
	        {
	            first_repeat = arr[i];  
	        }
	        else
	        {
	            set.add(arr[i]);
	        }
	    }
    //At last first_repeat variable will be having the first repeating value in it...
    
	    if(first_repeat==-1)  //if the value is not changed..then no value is repeating..
	    {
	        System.out.println("There is no repeating value in the array..");
	    }
	    else
	    {
	        System.out.println("First repeating value in the array is "+first_repeat);
	    }
	}
}

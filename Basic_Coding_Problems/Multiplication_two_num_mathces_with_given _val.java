import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int A[] = {4,1,3,10,7,5,8};
		int val = 15;
		
		//Brute Force approach.
		/*int i,j;
		int mul =0;
		boolean exist=false;
		for(i=0;i<A.length-1;i++)
		{
		    for(j=i+1;j<A.length;j++)
		    {
		        mul = A[i]*A[j];
		        if(mul==val)
		        {
		            exist=true;
		            break;
		        }
		    }
		}
		if(!exist)
		{
		    System.out.println("It is not there..");
		}
		else
		{
		    System.out.println("It exists");
		}*/
		
		//Optimized Approach..
		
	/*	boolean exists=false;
		//sort the array first.
		Arrays.sort(A);
		
		int start = 0;
		int end = A.length-1;
		while(start<=end)
		{
		    int mul = A[start]*A[end];
		    if(val<mul)
		    {
		        end--;
		    }
		    else if(val>mul)
		    {
		        start++;
		    }
		    else
		    {
		       exists=true;
		       break;
		    }
		}
		if(exists)
		{
		    System.out.println("Exists............");
		}
		else
		{
		    System.out.println("Nooooooooooo");
		}*/
		
		Set<Integer> set = new HashSet<>();
		int i;
		boolean exists=false;
		for(i=0;i<A.length;i++)
		{
		    if(val%A[i]==0 && set.contains(val/A[i]))
		    {
		        exists=true;
		        break;
		    }
		    else
		    {
		        set.add(A[i]);
		    }
		}
		if(exists)
		{
		    System.out.println("existssss");
		}
		else
		{
		    System.out.println("noooooooooooooooo");
		}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int A[] = {2,2,2,3,3,4,7,8};
		int B[] = {1,2,4,4,6,6,7,8,10};
    
		List<Integer> intersection = new ArrayList<>();  //intersection list.
    
		int i=0,j=0;
		while(i<A.length && j<B.length)
		{
		    while(i<A.length-1 && A[i]==A[i+1])  //To avoid the duplicate elements.
		    {
		        i++;
		    }
		    while(j<B.length-1 && B[j]==B[j+1])  //same with this array too..
		    {
		        j++;
		    }
		     
		    if(A[i]<B[j])
		    {
		        i++;
		    }
		    else if(B[j]<A[i])
		    {
		        j++;
		    }
		    else  //if both the elements are same..add in to the intersection list..
		    {
		        intersection.add(A[i]);
		        i++;
		        j++;
		    }
		}
		System.out.println(intersection);
	}
}

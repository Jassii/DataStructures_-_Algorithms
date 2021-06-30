import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int A[] = {4,2,3,5,4,2,3};
		int B[] = {9,1,7,2,4,2,1,2};
		
		Set<Integer> set = new HashSet<>();    
		Set<Integer> intersection = new HashSet<>();  //intersection set.
		int i;
		for(i=0;i<A.length;i++)
		{
		    set.add(A[i]);
		}
		for(i=0;i<B.length;i++)
		{
		    if(set.contains(B[i]))
		    {
		        intersection.add(B[i]);  //this won't allow duplicate common elements..
		    }
		}
		System.out.println(intersection);
	}
}

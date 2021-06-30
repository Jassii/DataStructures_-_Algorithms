import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int A[] = {4,2,3,5,4,2,3};
		int B[] = {9,1,7,2,4,2,1,2};
		
		Set<Integer> set = new HashSet<>();    
		List<Integer> intersection = new ArrayList<>();  //intersection list.
		int i;
		for(i=0;i<A.length;i++)
		{
		    set.add(A[i]);
		}
		for(i=0;i<B.length;i++)
		{
		    if(set.contains(B[i]))
		    {
		        intersection.add(B[i]);
		        set.remove(B[i]);
		    }
		}
		System.out.println(intersection);
	}
}

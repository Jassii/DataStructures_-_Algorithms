import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int A[] = {4,2,3,5,4,2,3};
		int B[] = {9,1,7,2,4,2,1,2};
		
		//We will be using Hashing..
		Set<Integer> union = new HashSet<>();  //union list.
		int i;
		for(i=0;i<A.length;i++)
		{
		    union.add(A[i]);
		}
		for(i=0;i<B.length;i++)
		{
		    union.add(B[i]);
		}
		System.out.println(union);
	}
}

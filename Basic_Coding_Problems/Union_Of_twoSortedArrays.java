import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int A[] = {2,2,2,3,3,4,7,8};
	    int B[] = {1,2,4,4,6,6,7,8,10};
	    
	   List<Integer> union = new ArrayList<>();  //union list..
	    
	    int i=0,j=0;
	     
	    while(i<A.length && j<B.length)  //traversing both the arrays..
	    {
	        //this while loop is for the duplicate elements in A[] array..
	        while((i<A.length-1) && (A[i]==A[i+1]))
	        {
	            i++;
	        }
	        
	        //this while loop is for the duplicate elements in B[] array..
	        while((j<B.length-1) && (B[j]==B[j+1]))
	        {
	            j++;
	        }
	        //now I will be having respective value for i and j..
	        //now we will compare.
	        if(A[i]<B[j])
	        {
	            union.add(A[i]);
	            i++;
	            
	        }
	        else if(B[j]<A[i])
	        {
	            union.add(B[j]);
	            j++;
	            
	        }
	        else if(A[i]==B[j])  //if they are equal..then add that element..and increase both the index value.
	        {
	            union.add(A[i]);
	            i++;
	            j++;
	            
	        }
	    }
	    
	    
	    //this is for the remaining elements in the A[] array..
	    while(i<A.length)
	    {
	        if(i<A.length-1 && A[i]==A[i+1])
	        {
	            i++;
	        }
	        else
	        {
	           union.add(A[i]);
	           i++; 
	        }
	    }
	    
	    //this is for the remaining elements in the B[] array..
	    while(j<B.length)
	    {
	        if(j<B.length-1 && B[j]==B[j+1])
	        {
	            j++;
	        }
	        else
	        {
	           union.add(B[j]);
	           j++;
	        }
	    }
	   System.out.print(union);
	   

	    //My Method..
	    
	    /*List<Integer> union = new ArrayList<>();
	    
	    int n1 = A.length;
	    int n2 = B.length;
	    int i=0,j=0;
	    while(i<n1 && j<n2)
	    {
	        if(A[i]<=B[j])
	        {
	            if(!union.contains(A[i]))
	            {
	               union.add(A[i]);
	            }
	            i++;
	        }
	        else if(B[j]<A[i])
	        {
	            if(!union.contains(B[j]))
	            {
	               union.add(B[j]);
	            }
	            j++;
	        }
	    }
	    while(i<n1)
	    {
	        if(!union.contains(A[i]))
	        {
	            union.add(A[i]);
	        }
	           i++;
	    }
	    while(j<n2)
	    {
	        if(!union.contains(B[j]))
	        {
	           union.add(B[j]); 
	        }
	        j++;
	    }
	    
	    Integer U[] = union.toArray(new Integer[0]);  //when you want to convert the list into array..
	    
	    int k;
	    for(k=0;k<U.length;k++)
	    {
	        System.out.print(U[k]+" ");
	    }
	    //System.out.println(union);*/
	}
}

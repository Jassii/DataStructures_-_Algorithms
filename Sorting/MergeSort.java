import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {14,12,28,22,32,30,42,2};  //unsorted array..
		MergeSort M = new MergeSort();
		M.sort(arr,0,arr.length);
		System.out.println("Sorted Array is: ");
		M.printArray(arr);
	}
}
class MergeSort
{
    //Using Merge Sort in order to sort the array..
	public static void merge(int arr[],int l,int m,int r)
	{
	    //find the size of two subarrays that has to be merged..
	    int n1 = m-l+1;  //first (+1 because l starting from 0..)
	    int n2 = r-m;  //second
	    
	    //create temporary arrays..
	    int L[] = new int[n1];  //left array..
	    int R[] = new int[n2];  //right array..
	    
	    
	    //left subarray..
	    for(int i=0;i<n1;i++)
	    {
	        L[i]=arr[i];
	    }
	    
	    //right subarray..
	    for(int i=0;i<n2;i++)
	    {
	        R[i] = arr[m+1+i];
	    }
	    System.out.println("temporary arrat of L");
	    for(int i=0;i<L.length;i++)
	    {
	        System.out.print(L[i]+" ");
	    }
	    System.out.println("temporary arrat of R");
	    for(int i=0;i<R.length;i++)
	    {
	        System.out.print(R[i]+" ");
	    }
	    System.out.println();
	    
	    //now merge the two temporary arrays..
	    int k=l;  //this will help in the input in the array...(sorted values..)
	    
	    int i=0,j=0;
	    while(i<n1 && j<n2)
	    {
	        if(L[i]<=R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k]=R[j];
	            j++;
	        }
	        k++;  //as value will definitely be put at the index "k"..
	    }
	    
	   //copy remaining elements of l[] if any.
	   while(i<n1)
	   {
	       arr[k] = L[i];
	       i++;
	       k++;
	   }
	   //copy remaining elements of R[] if any.
	   while(j<n2)
	   {
	       arr[k] = R[j];
	       j++;
	       k++;
	   } 
	}
	
		//now printing the sorted array..
	public static void printArray(int arr[])
	{
	    int i;
	    for(i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
	
	
	public static void arrSort(int arr[],int start,int end)
	{
	    for(int i=0;i<arr.length-1;i++)
	    {
	        for(int j=0;j<arr.length-i-1;j++)
	        {
	            if(arr[j]>arr[j+1])
	            {
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	           }
	        }
	    }
	}
	//this will help for divide and conquer..
	public void sort(int arr[],int l,int r)
	{
	    if(l<r)  //starting index should be less than ending index..
	    {
	        int m = l+(r-1)/2;  //middle index..(dividing the array into halves..)
	        //sort the left and right half.
	        arrSort(arr,l,m);
	        arrSort(arr,m+1,r-1);
	        
	        printArray(arr);
	        System.out.println();
	        //now merge both the sorted arrays..
	        merge(arr,l,m,r-1);
	    }
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int arr[] = {5,90,3,6,1};  //unsorted array..
		int indexUnsorted = searchUnsorted(arr,1);  //getting the index of the value..
	    if(indexUnsorted==-1)
	    {
	        System.out.println("Value is not present in the unsorted array.");
	    }
	    else
	    {
	        System.out.println("Value is found at index "+indexUnsorted+" in the unsorted array.");
	    }
	    
	    int arr1[] = {1,3,7,10,45};  //sorted array..
	    int indexSorted = searchSorted(arr1,45);  //getting the index of the value..
		if(indexSorted==-1)
	    {
	        System.out.println("Value is not present in the sorted array.");
	    }
	    else
	    {
	        System.out.println("Value is found at index "+indexSorted+" in the sorted array.");
	    }
	}
  
  //will be taking the help of Binary Search algorithm..
	public static int searchSorted(int arr[],int k)
	{
	    int start=0;
	    int high = arr.length-1;
	    int pos = binarySearch(arr,start,high,k);
	    return pos;
	}
	public static int binarySearch(int arr[],int start,int end,int k)
	{
	    if(start<=end)
	    {
	        int mid = (start+end)/2;
	        if(arr[mid]==k)
	        {
	            return mid;
	        }
	        else if(k<arr[mid])
	        {
	            return binarySearch(arr,start,mid-1,k);
	        }
	        else if(k>arr[mid])
	        {
	            return binarySearch(arr,mid+1,end,k);
	        }
	    }
	    return -1;
	}
  
  //in finding the value in the unsorted array..simply iterate it.and compare with the value to be searched..
	public static int searchUnsorted(int arr[],int k)
	{
	    int i;
	    for(i=0;i<arr.length;i++)
	    {
	        if(arr[i]==k)
	        {
	            return i;
	        }
	    }
	    //if the element is not present..then simply return -1..
	    return -1;  //element is not found..
	}
}

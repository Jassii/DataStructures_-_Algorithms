import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {14,12,28,22,32,30,42,2};  //unsorted array..
		insertionSort(arr);
		System.out.println("Sorted Array is: ");
		printArray(arr);
	}
	//Using Insertion Sort in order to sort the array..
	public static void insertionSort(int arr[])
	{
	    int i;
	    int n = arr.length;  //length of the array..
	    for(i=1;i<n;i++)  //traverse from 1 position.
	    {
	        int key = arr[i];  //value at the specific index..
	        
	        int j = i-1; //index of the preceding value..
	        
	        while(j>=0 && arr[j]>key)  //j should be greater than the 0th index and if its value is greater than key.
	        {
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1]=key; //if it is -1 or while condition not satisfied..
	    }
	}
	//now printing the array..
	public static void printArray(int arr[])
	{
	    int i;
	    for(i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}

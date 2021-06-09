import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        int arr[] = {4,2,5,6,0,2,4,6};  //unsorted array..
        //int n = arr.length;
        int low=0; //0th index..
        int high = arr.length;  //total length..
      
        quickSort(arr,low,high-1);  //divide and conquer algorithm..
      
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
    
    public static void quickSort(int arr[],int low,int high)  //i have to sort in ascending order..
    {
        if(low<high)
        {
            //simply partition the array..
            int pi = partition(arr,low,high);  //this will return the correct position of the pivot element..
          
            quickSort(arr,low,pi-1);  //do the partition for the left side of the pivot element.. (excluding pivot)
            quickSort(arr,pi+1,high);  //do the partition for the right side of the pivot element..(excluding pivot)
        }
    }
    
    //main algo(partition of the array..)(dividing)
    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];  //pivot element..that is the last element..
        
      // Index of smaller element and
    // indicates the right position
    // of pivot found so far
        int i = low-1;
      
        for(int j=low;j<=high-1;j++)  //traverse till the second last element...
        {
            if(arr[j]<pivot)  //if the value is less than the pivot element..
            {
                i++; 
                swap(arr,i,j);  //swap the values..(i with the j)
            }
        }
      
        swap(arr,i+1,high);  //swap the values between i+1 and pivot..
      
        return i+1;  //correct position of the pivot element..
    }
    
    //function to swap the values in the array..
    public static void swap(int arr[],int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
    //function to print the array..
    public static void printArray(int arr[])
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

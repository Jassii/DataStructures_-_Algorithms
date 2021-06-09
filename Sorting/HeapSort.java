import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        int arr[] = {12,11,13,5,6,7};  //unsorted array..
        int n = arr.length;
        heapSort(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
    public static void heapSort(int arr[])  //i have to sort in ascending order..
    {
        //first step is to create a max heap..
        int i;
        int n =arr.length;
        for(i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);//this will create the heap.
        }
        
        //now swap the value from the last to the first..
        for(i=n-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            //now apply headpify on the 0th index value..(on the modified array..)
            heapify(arr,i,0);
        }
    }
    
  //this function will rearrange the elements in the form of MAX_HEAP..
    public static void heapify(int arr[],int n,int i)
    {
        int largest = i;  //root 
        int l = 2*i+1;  //left child.
        int r = 2*i+2;  //right child..
        
        //if left child is greater than the root node.
        if(l<n && arr[l]>arr[largest])
        {
            largest = l;
        }
        
        //if right child is greater than the root node.
        if(r<n && arr[r]>arr[largest])
        {
            largest = r;
        }
        
        //if largest is not equal to i..(means the value is changed..)
        if(largest!=i)
        {
          //swap the values..
            int swap = arr[largest];
            arr[largest] = arr[i];
            arr[i] = swap;
            
            //apply heapify on the modified array..(so that max_heap property satisfies..)
            heapify(arr,n,largest);
        }
    }
  
  //this function will print the values present in the array..
    public static void printArray(int arr[])
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

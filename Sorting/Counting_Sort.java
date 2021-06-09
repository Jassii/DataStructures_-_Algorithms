import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        int arr[] = {1,4,1,2,7,5,2};  //unsorted array..
        //int n = arr.length;
        countingSort(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
    
    public static void countingSort(int arr[])  //i have to sort in ascending order..
    {
        int i;
        
        int output[] = new int[10];  //this will store the output of the array..
        
        int count[] = new int[10];  //this array will be storing the count of each number present in the array..
        
        //assigning first each value to 0..in count array...
        for(i=0;i<10;i++)
        {
            count[i]=0;
        }
        
        //now finding the count of each value..
        for(i=0;i<arr.length;i++)
        {
            int index = arr[i];  //value present in the array(arr)..
            count[index] = count[index]+1; //increase the value by one.
        }
        
        //now update the value of count array...by the sum of the previous counts..
        //int sum = count[0];
        for(i=1;i<10;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        System.out.println("Count array is as follows ;");
        for(i=0;i<10;i++)
        {
            System.out.print(count[i]+" ");
        }
        System.out.println();
        //The modified count array indicates the position of each object in the output sequence.
        for(i=0;i<arr.length;i++)
        {
            int index_val = arr[i];
            int val = count[index_val];
            output[val-1] = index_val;
            count[index_val]=count[index_val]-1;  //decrease it by one..
        }
        
        //for copying the value from the output array to the main array..
        for(i=0;i<arr.length;i++)
        {
            arr[i] = output[i];
        }
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

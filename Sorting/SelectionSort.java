import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {14,12,28,22,32,30,42,2};  //unsorted array..
        selectionSort(arr);
        System.out.println("Sorted Array..");
        printArray(arr);
    }
    public static void selectionSort(int arr[])
    {
       int n = arr.length; //length of the array..
       int i,j;
       for(i=0;i<n-1;i++)
       {
           int min_ind = i;//this will store minimum value from greater than equal to j..
           for(j=i+1;j<n;j++)
           {
               if(arr[j]<arr[min_ind])
               {
                   min_ind = j;
               }
           }
           //after the iteration...(min_ind will store the index of the minimum element.> i.)
           //now swap the value at the min_ind and at i..
           int temp = arr[min_ind];
           arr[min_ind] = arr[i];
           arr[i] = temp;
       }
    }
    public static void printArray(int arr[])
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {14,12,28,22,32,30,42,2};  //unsorted array..
        bubbleSort(arr);
        System.out.println("Sorted Array(BubbleSort..");
        printArray(arr);
    }
    public static void bubbleSort(int arr[])
    {
       int n = arr.length; //length of the array..
       int i,j;
       for(i=0;i<n-1;i++)
       {
           for(j=0;j<n-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
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

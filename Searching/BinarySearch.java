import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = sc.nextInt();
        int i;
        int start=0;
        int end=arr.length-1;
       // boolean found = false;
        int found = binarySearch(start,end,arr,k);
        if(found==-1)
        {
            System.out.println("Value is not present..");
        }
        else
        {
            System.out.println("Value is present at index "+foundd);
        }
    }
    public static int binarySearch(int start,int end,int arr[],int k)
    {
        if(start<=end)
        {
           int mid = (start+end)/2;
        if(arr[mid]==k)
        {
            return mid;
        }
        if(k<arr[mid])
        {
            return(binarySearch(start,mid-1,arr,k));
        }
        else if(k>arr[mid])
        {
            return(binarySearch(mid+1,end,arr,k));
        }    
        }
        return -1;
    }
}

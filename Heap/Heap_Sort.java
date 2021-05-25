import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,7,11,30,8,38,2,45};
        Heap h = new Heap();
        int ar[]=new int[arr.length];
        ar = h.heap_sort(arr);
        int i;
        for(i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
class Heap
{
    public int[] heap_sort(int arr[])
    {
        PriorityQueue<Integer> P = new PriorityQueue<>();  //creating a PriorityQueue for minHeap..
        int i;
        //putting all the values of the array in the minHeap
        for(i=0;i<arr.length;i++)
        {
            P.add(arr[i]);
        }
        //Now extracting one by one...and printing the peek value (which will come in ascending order..)
        for(i=0;i<arr.length;i++)
        {
            arr[i]=P.poll();   //extracted element is put in the array..(each time it is automatically reshuffling itself.)
        }
        return arr;
    }
}

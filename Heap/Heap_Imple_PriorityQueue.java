import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,7,11,5,2,13,1,45};
        Heap h = new Heap(); //creating an object of the Heap class..
        h.minHeap(arr);  //for the minimum heap..
        h.maxHeap(arr);  //for the maximum heap..
    }
}
class Heap
{
    public void minHeap(int arr[])
    {
        //create a prioriy queue..
        PriorityQueue<Integer> P = new PriorityQueue<>();  //initialized the PriorityQueue.
        int i;
        for(i=0;i<arr.length;i++)
        {
            P.add(arr[i]);  //insert in the PrioriyQueue.
            System.out.print(P.peek()+" ");
        }
        System.out.println("..AND..");
        
        for(i=0;i<arr.length-1;i++)
        {
             System.out.print(P.peek()+" "); //first see the peek value then remove it...
            P.poll();  //removing the value from the PrioriyQueue
        }
    }
    public void maxHeap(int arr[])
    {
        System.out.println();
        PriorityQueue<Integer> P = new PriorityQueue<>(Collections.reverseOrder());  //for maxHeap..
        int i;
        for(i=0;i<arr.length;i++)
        {
            P.add(arr[i]);
            System.out.print(P.peek()+" ");
        }
        System.out.println();
        for(i=0;i<arr.length-1;i++)
        {
            P.poll();  //remove the top element..
            System.out.print(P.peek()+" ");
        }
    }
}

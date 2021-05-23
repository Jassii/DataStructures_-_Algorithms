import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,7,11,30,8,38,2,45};
        Heap h = new Heap(); //creating an object of the Heap class.
        int k = sc.nextInt(); 
        
        //if we are trying to access the index..which is not in range...
        if(k>arr.length)
        {
            System.out.println("Invalid Case");
            System.exit(0);
        }
        h.maxHeap(arr,k);  //for the minimum heap..
        h.minHeap(arr,k);  //for the maximum heap..
    }
}
class Heap
{
    public void minHeap(int arr[],int k)
    {
        //create a prioriy queue..
        PriorityQueue<Integer> P = new PriorityQueue<>();  //initialized the PriorityQueue.
        int i;
        
        //simply create the minHeap..
        for(i=0;i<arr.length;i++)
        {
            P.add(arr[i]);  //insert in the PrioriyQueue.
            System.out.print(P.peek()+" ");
        }
        
        System.out.println("\n..AND..now its time to find the kth smallest value..");
        
        for(i=0;i<k-1;i++)  //retrieve the element till (k-1)
        {
            P.poll();  //removing the value from the PrioriyQueue
        }
        System.out.println("Kth smallest value using minHeap is : "+P.peek());
    }
    public void maxHeap(int arr[],int k)
    {
        System.out.println();
        PriorityQueue<Integer> P = new PriorityQueue<>(Collections.reverseOrder());  //for maxHeap..
        int i;
        
        for(i=0;i<k;i++)  //create the max heap of "k" size...
        {
            P.add(arr[i]);
            System.out.print(P.peek()+" ");
        }
        System.out.println();
        //now further trying to insert the element in the heap.
        for(i=k;i<arr.length;i++)
        {
            if(arr[i]<P.peek())
            {
                P.poll();  //remove the peek element..
                P.add(arr[i]);   //add the new element..
            }
        }
        System.out.println("Kth smallest value using maxHeap is : "+P.peek());
    }
}

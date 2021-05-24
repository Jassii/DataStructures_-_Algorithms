import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,7,11,30,8,38,2,45};
        Heap H = new Heap(); //creating an object of the Heap class.
        int k = sc.nextInt();
        //H.maxHeap(arr,k);
        H.minHeap(arr,k);
    }
}
class Heap
{
    public void maxHeap(int arr[],int k)
    {
       PriorityQueue<Integer> P = new PriorityQueue<>(Collections.reverseOrder());//for max heap..
       int i;
       for(i=0;i<arr.length;i++)
       {
           P.add(arr[i]);
       }
       System.out.println("Top "+k+" largest value are as follow: ");
       for(i=0;i<k;i++)
       {
          System.out.print(P.peek()+" ");
          P.poll();
       }
    }
    
    public void minHeap(int arr[],int k)
    {
        PriorityQueue<Integer> P = new PriorityQueue<>(); 
        int i;
        //create a min heap of k size..
        for(i=0;i<k;i++)
        {
            P.add(arr[i]);
        }
        
        for(i=k;i<arr.length;i++)
        {
            if(arr[i]>P.peek())
            {
                P.poll();
                P.add(arr[i]);
            }
        }
        System.out.println("Top k largest element are as follows..");
        for(i=0;i<k;i++)
        {
            System.out.print(P.peek()+" ");
            P.poll();
        }
    }
}

import java.util.*;
class Heap
{
    
    //this function will return the K largest number in the array..(using maxHeap.)
    public void maxHeap(int arr[],int k)
    {
        PriorityQueue<Integer> P = new PriorityQueue<>(Collections.reverseOrder()); //maxHeap.
        int i;
        //insertion portion..
        for(i=0;i<arr.length;i++)
        {
            P.add(arr[i]);
            System.out.print(P.peek()+" "); 
        }
        //deletion portion..
        for(i=0;i<k-1;i++)
        {
            P.poll();  //this will remove the root node(or first element..)
        }
        System.out.println("\nKth largest element is: "+P.peek());
    }
    
    //function which will return the Kth largest number in the array..(using minHeap)..
    public void minHeap(int arr[],int k)
    {
        PriorityQueue<Integer> P = new PriorityQueue<>(); //for minHeap.
        int i;
        //create a minHeap of k size..
        for(i=0;i<k;i++)
        {
            P.add(arr[i]);
            System.out.print(P.peek()+" ");
        }
        System.out.println();
        for(i=k;i<arr.length;i++)
        {
            if(arr[i]<P.peek())  //if it less than the peek element then no change..as the peek element is the Kth largest.
            {
                continue;
            }
            else  //when the element to be inserted is greater than the peek element..
            {
                P.poll(); //remove the top element.
                P.add(arr[i]);  //it will automatically reshuffle..and the peek element will be the kth largest...
            }
        }
        System.out.println("Kth largest element is : "+P.peek());
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        Heap H = new Heap();  //created an object of the Heap class..
        int k = sc.nextInt();
        H.maxHeap(arr,k);
        System.out.println();
        H.minHeap(arr,k);
    }
}

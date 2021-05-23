import java.util.*;
class Heap
{
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
    }
}

import java.util.*;

class Heap
{
    public int minCostHeap(int arr[])
    {
        PriorityQueue<Integer> P = new PriorityQueue<>();  //this is for minHeap..
        int i;
        //created a PQ which will store the value in the form of MinHeap..
        for(i=0;i<arr.length;i++)
        {
            P.add(arr[i]);
        }
        
         int min_cost=0;
        while(P.size()>1)
        {
            int tcost = P.poll()+P.poll();
            min_cost=min_cost+tcost;
            P.add(tcost);
        }
        return min_cost;
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Heap H = new Heap();
        int ropes[] = {3,4,7,2};
        
        int value = H.minCostHeap(ropes);
        System.out.println("Minimum cost of the rope is "+value);
    }
}

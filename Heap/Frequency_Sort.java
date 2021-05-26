import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,7,10,6,10,7,5};
        Heap H = new Heap();
        //H.topfreqMaxHeap(arr);
        H.topfreqMinHeap(arr);
    }
}
class Heap
{
    public void topfreqMaxHeap(int arr[])
    {
        //we will take a map which will store the frequency of each number
        Map<Integer,Integer> M = new HashMap<>();
        int i; //now we will traverse the array.
        for(i=0;i<arr.length;i++)   //frequency of each element in the array..
        {
            //if(M.containsKey(arr[i]))  //if HashMap is having the key..
            //{
                //M.put(arr[i],M.getOrDefault(arr[i],0)+1);  //if it is presenet..(+1)  otherwise 1..(key,value pair)
            //}
            if(M.containsKey(arr[i]))
            {
                M.put(arr[i],M.get(arr[i])+1);
            }
            else
            {
                M.put(arr[i],1);
            }
        }
        //as all the entries have been done in the map..
        //now its time to create max heap of the mapEntries..
        //AS i wanted to operate on the max heap...
        PriorityQueue<Map.Entry<Integer,Integer>> P = new PriorityQueue<>((n1,n2) -> n2.getValue()-n1.getValue());
        
        P.addAll(M.entrySet());  //this will put all the entries in the PriorityQueue..
        
        while(!P.isEmpty())
        {
            System.out.print(P.peek().getKey()+" ");
            P.poll();
        }
    }
    public void topfreqMinHeap(int arr[])
    {
       //we will take a map which will store the frequency of each number
        Map<Integer,Integer> M = new HashMap<>();
        int i; //now we will traverse the array.
        for(i=0;i<arr.length;i++)   //frequency of each element in the array..
        {
            //if(M.containsKey(arr[i]))  //if HashMap is having the key..
            //{
                //M.put(arr[i],M.getOrDefault(arr[i],0)+1);  //if it is presenet..(+1)  otherwise 1..(key,value pair)
            //}
            if(M.containsKey(arr[i]))
            {
                M.put(arr[i],M.get(arr[i])+1);
            }
            else
            {
                M.put(arr[i],1);
            }
        }
        
        //now putting all the map entries in the min Heap..
        PriorityQueue<Map.Entry<Integer,Integer>> P = new PriorityQueue<>((n1,n2)->n1.getValue()-n2.getValue());
        
       for(Map.Entry<Integer,Integer> entry:M.entrySet())
       {
           P.add(entry);
       }
       while(!P.isEmpty())
       {
           System.out.print(P.peek().getKey()+" ");
           P.poll();
       }
    }
}

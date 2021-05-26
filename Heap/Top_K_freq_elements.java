import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {8,10,7,8,11,30,11,8,38,11,2,45,2,8};
        int k = sc.nextInt();  //this will tell about the frequent..
        Heap H = new Heap();
        H.topfreqMaxHeap(arr,k);
        H.topfreqMinHeap(arr,k);
    }
}
class Heap
{
    public void topfreqMaxHeap(int arr[],int k)
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
        
        for(i=0;i<k && !P.isEmpty();i++)
        {
            System.out.print(P.peek().getKey()+" ");
            P.poll();
        }
    }
    public void topfreqMinHeap(int arr[],int k)
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
           if(P.size()<k)
           {
               P.add(entry);
           }
           else
           {
               if(entry.getValue()>P.peek().getValue())
               {
                   P.poll();
                   P.add(entry);
               }
           }
       }
       for(i=0;i<k;i++)
       {
           System.out.print(P.peek().getKey()+" ");
           P.poll();
       }
    }
}

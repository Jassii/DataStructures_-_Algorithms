import java.util.*;
class Heap
{    
    //function which will return the Kth largest number in the array..(using minHeap)..
    PriorityQueue<Integer> P = new PriorityQueue<>(); //for minHeap.
    public int add_MIN(int value,int k)
    {
        //keep on inserting untill the size of PriorityQueue is less than k..
        if(P.size()<k)//it means that we have the array of size 2 and we have to return 4th largest number..
        {
            P.add(value);
            if(P.size()==k) //if the size of the PriorityQueue is equal to k..it has to return the peek element.
            {
                return P.peek();
            }
            else
            {
                return -1;
            }
        }
        //after creating the heap of size k..
        if(value>P.peek())  //if the value to be inserted is greater than the peek element..
        {
            P.poll();  //remove the top element..
            P.add(value);  //add in the heap..and it will automatically reshuffle it..
        }
        return P.peek();
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
        int i;
        for(i=0;i<arr.length;i++)
        {
           System.out.println(H.add_MIN(arr[i],k));   //print the kth largest at each insertion...
        }
    }
}

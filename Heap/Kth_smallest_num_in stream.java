import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,7,11,5,27,3,2,1};
        Heap H = new Heap(); //creating an object of the Heap class.
        int k = sc.nextInt(); 
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.println(H.add_max(arr[i],k));
        }
    }
}
class Heap
{
    PriorityQueue<Integer> P = new PriorityQueue<>(Collections.reverseOrder());   //creating a minimum heap..
    public int add_max(int value,int k)
    {
        if(P.size()<k)
        {
            P.add(value);
            if(P.size()==k)
            {
                return P.peek();  //It will actually be the kth smallest value till that time..
            }
            else
            {
                return -1;
            }
        }
        //as the max heap tree is generated..
        if(value<P.peek())
        {
            P.poll();
            P.add(value);
        }
        return P.peek();
    }
}

import java.util.*;
//Here we will understand the implementation of the Heap Data Structure..
class Heap
{
    int pos=0; //this will tell that at which position the value will be inserted..
    //take an array..
    int arr[] = new int[20];  //it will store the value of the nodes...
    //this function will help in inserting the value in the array or we can say in the heap tree..
    //at the end of the tree.
    public void insertVal(int data)
    {
        arr[pos] = data;  //at first the pos will be 0 so it will be stored at 0th index..
        int index = pos; //my index at position value..(for first iteration it will be 0)
        int parent = (index-1)/2;  //this will tell about the parent index..(for first iteration it will be 0 for the parent too)
        
        while(parent>=0 && arr[parent]<arr[index])  //checking whether it satisfies the property of MaxHeap..
        {
            //if the above condition is true..then swap the values(between parent and the new value inserted..)
            int temp;
            temp = arr[parent];
            arr[parent] = arr[index];
            arr[index] = temp;
            
            index = parent; //changing the index value so that it can be compared with the just above parent.
            parent = (index-1)/2; //this will change the value of the parent index..
        }
       pos++; //as value is inserted size has to be increased.. 
    }
    
    //inorder to get the maximum of the tree..
    public int getMax()
    {
       return arr[0]; 
    }
    
    //function to remove the maximum value of the tree..
    public int removeMax()
    {
        //when i have to remove i have to remove from the top element..
        int max = arr[0]; //top element..
        arr[0] = arr[pos-1];
        pos = pos-1;
        maxHeapify(0);
        return max;
    }
    public void maxHeapify(int index)
    {
        int l,r;//here we are finding the children..
        l = (2*index)+1;
        r = (2*index)+2;
        int largest = index;
        if(arr[l]>arr[largest] && l<this.pos)
        {
            largest = l;
        }
        if(r<this.pos && arr[r]>arr[largest])
        {
            largest = r;
        }
        if(largest!=index)
        {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            maxHeapify(largest);
        }
    }
}

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Heap h = new Heap();  //creating an object of the Heap class..
        int arr[] = {10,7,11,30,20,38,2,45}; //array storing the values which will be inserted..
        h.insertVal(arr[0]);
        h.insertVal(arr[1]);
        h.insertVal(arr[2]);
        
        System.out.println(h.getMax());  //this will print the maximum value till now..
        
        h.insertVal(arr[3]);
        h.insertVal(arr[4]);
        
        System.out.println(h.getMax());  //this will print the maximum value till now..
        
        h.insertVal(arr[5]);
        
        System.out.println(h.getMax());  //this will print the maximum value till now..
        
        h.insertVal(arr[6]);
        h.insertVal(arr[7]);
        
        System.out.println(h.getMax());  //this will print the maximum value till now..
        
        h.removeMax();//now removing the maximum value..
        
        System.out.println(h.getMax());  //this will print the maximum value after removing the maximum value..
    }
}

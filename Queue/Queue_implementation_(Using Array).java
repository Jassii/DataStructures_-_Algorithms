import java.util.*;

//creating Queue class inorder to implement Queue data structure..
class Queue
{
    private int front,rear,maxSize;
    private String arr[];
    
    public Queue(int maxSize)  //creating constructor..
    {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new String[maxSize];
    }
    
    //when we want to enqueue the value in the Queue..
    public void enqueue(String data)
    {
        //check if the queue is full or not.
        if(rear == maxSize-1)
        {
            System.out.println("Queue is full");
        }
        else  //queue is not full
        {
            rear++;
            arr[rear] = data; //will insert the data at the rear index..
        }
    }
  
  //when you want to delete an element...(from the front)
    public void dequeue()  
    {
            //check if the queue is empty or not..
            if(front>rear)
            {
                System.out.println("Queue is empty..");
            }
            else
            {
                System.out.println(arr[front]+" value is removed from the queue..");
                front++;
               
            }
    }
    
  //when you want to display the elements present in the queue..
    public void display()
    {
        System.out.println("Displaying elements present in the queue");
        int i;
        for(i=front;i<=rear;i++)  //from front to rear.
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class Main  //main method..
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(5);   //making object of the Queue class..
        q.enqueue("jasjeet");
        q.enqueue("singh");
        q.enqueue("hello");
        q.enqueue("how");
        q.enqueue("are");
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.dequeue();
    }
}

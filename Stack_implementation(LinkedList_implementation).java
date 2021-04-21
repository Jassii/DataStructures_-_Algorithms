import java.util.*;

//creating the node class..
class Node
{
    private int data;  //data
    private Node next;  //address of the next node..
    
    public Node(int data)  //creating the constructor..
    {
        this.data = data;
    }
    
    //set data..
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return this.data;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
    public Node getNext()
    {
        return this.next;
    }
}
//creating the linked list class...
class LinkedList
{
    private Node head; //will point to the head;;
    private Node tail;  //will point to the tail..
    
    public Node getHead()
    {
		return this.head;
	}
	public Node getTail()
    {
		return this.tail;
	}
    
    //insert at the beg..
    public void push(int data)
    {
        //first create the node..
        Node node = new Node(data);  
        
        //check if the list is empty or not..
        if(this.head==null)
        {
            this.head = this.tail = node;
        }
        
        else
        {
            //no need to traverse.
            node.setNext(this.head);//new node should point to the earlier head..  
        
            this.head = node; //node will be the tail node..
        }
    }
    
    //when we want to delete the element..it will be removed from the top or we can say head....
    public void pop()
    {
        //first check if the list is empty or not..
        if(this.head==null)
        {
            System.out.println("Stack is empty..");
        }
        else
        {
            Node temp = this.head.getNext();
           this.head.setNext(null);
           this.head = temp;
           System.out.println("Top element is removed..");
        }
    }
    
    //when we want to retrieve the peek element.
   /* public void peek(int index)
    {
        //check if the list is empty or not..
        int count=0;
        if(this.head==null || index<0)
        {
            System.out.println("Stack is empty so could not retrieve the element from the specified index..");
        }
        else
        {
            Node temp = this.head;
            while(temp!=null)
            {
                if(count==index)
                {
                    System.out.println("Data present at specified index "+index+" is "+temp.getData());
                    break;
                }
                count++;
                temp= temp.getNext();
            }
        }
    }*/
    
    //inorder to remove the top element from the stack or the list..
    public void stackTop()
    {   
        //check if the stack is empty or not..
        if(this.head==null)
        {
            System.out.println("Stack is empty..");
        }
        else
        {
           System.out.println("Top element of the stack is "+this.head.getData());    
        }
    }
    
    public void display()  //display all the elements..
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(1);
        list.push(3);
        list.push(6);
        list.push(8);
        
        list.display();
      //   list.peek(2);
        list.pop();
        list.display();
        //list.peek(2);
        list.stackTop();
        
        
    }
}

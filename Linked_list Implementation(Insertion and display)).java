//implementation of linked list..
import java.util.*;

//creating the Node class..(will be used in creating the node..)
class Node
{
    private String data;  //used to store the data..
    private Node next; //used to store the address of the next node.
    
    public Node(String data)  //creating the constructor inorder to assign the value to the data....
    {
        this.data = data;
    }
    public void setData(String data)//used to set data in the node...
    {
        this.data = data;
    }
    public String getData() //inorder to get the data..
    {
        return this.data;
    }
    public void setNext(Node next) //used to set the address of the (next node).
    {
        this.next = next;
    }
    public Node getNext() //inorder to get the next value..
    {
        return this.next;
    }
}

//creating the LinkedList class..
class LinkedList
{
    private Node head; //creating the head of type Node class..
    private Node tail; //creating the tail of type Node class..
    
    //create a function inside that new node..to be inserted..
    public void addAtEnd(String data) //node to be inserted at the end..
    {
        Node node = new Node(data); //creating the object of Node class inorder to access it..
        
        //Checking if the linked list is empty or not..
        //If yes,make new node as head and tail node..
        if(this.head==null)
        {
            this.head = this.tail = node;
        }
        else
        {
            this.tail.setNext(node);//assigning the next value of earlier last to the new node..(Pointing the new node)
            this.tail = node; //making the toil point to the new node.. 
        }
        //System.out.println(node.getData());
        //System.out.println(node.getNext());
    }
    
    //function for the node to be inserted at the begenning..
    public void addAtBeg(String data)
    {
        Node node = new Node(data);
        if(this.head==null)
        {
            this.head = this.tail = node;
        }
        else
        {
            this.head.setNext(node);
            this.head = node;
        }
    }
    
    //function to display the LinkedList..
    public void display()
    {
        Node temp = this.head; //creating the temporary reference to store the head ..
        while(temp!=null)//traverse till the end.
        {
           System.out.println(temp.getData()); 
           temp = temp.getNext();    
        }   
    }
    
    //function to search an element from the linked list..
    public void Search(String data)
    {
        Node temp = this.head;
        while(temp!=null)  //traverse in the linked list..
        {
            if(temp.getData()==data)  //if it is equal..
            {
                System.out.println("Word found which is "+temp.getData());
                
                break;
            }
            
            temp = temp.getNext();
        }
        if(temp==null)
        {
          System.out.println("Word not found");    
        }
        
    }
}

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.addAtEnd("Jasjeet");
        list.addAtEnd("Mayank");
        list.addAtEnd("Gagan");
        list.addAtEnd("Saarthak");
        
        //list.addAtBeg("Riya");
        list.display();  //will display all the elements present in the linked list..
        list.Search("Jasjeet"); //will search for the data name "Jasjeet"..
        System.out.println("done");
    }
}

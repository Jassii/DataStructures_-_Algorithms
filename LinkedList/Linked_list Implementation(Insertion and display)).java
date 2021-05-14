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
    
    public Node getHead()
    {
		return this.head;
	}
	public Node getTail()
    {
		return this.tail;
	}
    
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
            node.setNext(this.tail.getNext());  //last node will point to the null value..
            this.tail.setNext(node);  //earlier tail will point to the new node..
            
            this.tail = node; //node will be the tail node..
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
            // If the list is not empty, add the element at the beginning
	    node.setNext(this.head);
	    // Make the new node as the head
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
    
    //function for inserting the data at any place in the linked list...
    public void insert(String data,String dataBefore)
    {
        Node node = new Node(data);  //creating a node with the new data..
        //checking if the list is empty or not..
        if(this.head==null)
        {
            this.head = this.tail = node;
        }
        
        else
        {
             Node temp = this.head;  //this will be used for traversing..
        
             while(temp!=null)
             {
                  if(temp.getData().equals(dataBefore))  //checking if the dataBefore is there or not..
                  {
                      
                      //if yes then making a connection b/w the node containing dataBefore and the new node containing data..
                      Node nodeBefore = temp;
                      node.setNext(nodeBefore.getNext());
                      nodeBefore.setNext(node);
                      if(node.getNext()==null)  //if it is inserted at the last..
                      {
                          this.tail = node;
                      }
                       break;
                  }
                   temp = temp.getNext();  //so that the temp reaches the end..
              }
             if(temp==null)  //if the dataBefore is not found in the Linked List..
             {
                  System.out.println("Value not found..");
             } 
        }
    }
    
   //function for deleting the data from the linked list...
    public void delete()
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

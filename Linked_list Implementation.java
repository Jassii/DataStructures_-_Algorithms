//linked list..

import java.util.*;

//creating the Node class..
class Node
{
    private String data; //for storing data..
    private Node next;  //for storing the link to the next node..
    
    public Node(String data)  //constructor..
    {
        this.data = data;
        this.next = null;
    }
    
    public void setData(String data)  //for setting the data..
    {
        this.data = data;
    }
    public void setNext(Node next)  //for setting the next value..
    {
        this.next = next;
    }
    public String getData()  //for getting the data..
    {
        return this.data;
    }
    public Node getNext()  //for getting the next value..
    {
        return this.next;
    }
}


//creating the linkedlist class..
public class LinkedList
{
    private Node head;   //beginning node..
    private Node tail;   //ending node..
    
    public Node getHead()
    {
        return this.head;
    }
    public Node getTail()
    {
        return this.tail;
    }
}




class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
    }
}

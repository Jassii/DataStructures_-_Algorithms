import java.util.*;

//Node class
class Node  //for creating a node..
{
    int data;
    Node left,right; //pointing left and right child..
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
//class for making Binary Tree
class BinaryTree
{
    //First create a node..(i.e. root node..)
    Node root;
    public BinaryTree(int data)
    {
        root = new Node(data);  //node will be created with the name of the data passed.
    }
    public BinaryTree()  //normal constructor..telling that node is not created.
    {
        root=null;
    }
}
class Main//main class..
{
    public static void main(String[]args)  //main method..
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();//object of the BinaryTree.
        
        //now creating a root node of data "1"..
        bt.root = new Node(1);
        //making left and right child nodes..("2" and "3")..    
        bt.root.left=new Node(2); //creating new node as a child of root node..
        bt.root.right=new Node(3); //creating new node as a child of root node..
        //making child of the left node..("4")
        bt.root.left.left = new Node(4); 
    }
}

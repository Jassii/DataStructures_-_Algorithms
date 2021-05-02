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
    
    //The below function tells about the **Breadth First Traversal**..
    
   /* 
    //function to display the elements present in the Binary Tree..
    public void printBFS()  //level order traversal..
    {
        //inorder to print the element first calculate the height of the binary tree..
        int h = height(root);
        int i;
        //now traversing till the end of the BT.
        for(i=1;i<=h;i++)
        {
            printTree(root,i); //function which will display the data at each node..at respective heights..
        }
    } 
    void printTree(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.println(root.data); //printing the data at the respective node..
        }
        else if(level>1)
        {
            printTree(root.left,level-1); //will decrease the level by one and going down the tree in left side...
            printTree(root.right,level-1); //will decrease the level by one and going down the tree in right side...
        }
    }
    int height(Node root) //function to calculate the height of BT.
    {
        if(root==null)//BT is empty.
        {
            return 0;
        }
        else
        {
            int lheight = height(root.left); //height of the left side..
            int rheight = height(root.right); //height of the right side..
            if(lheight>rheight)
            {
                return (lheight+1);  //we are adding 1 because of the root node..
            }
            else
            {
                return (rheight+1);  //we are adding 1 because of the root node..
            }
        }
    }*/
    
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
        bt.printBFS(); //function called to print the elements present in the BT..
    }
}

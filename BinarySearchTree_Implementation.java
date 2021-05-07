import java.util.*;

//creating a Node class..
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
    }
}

//creation of the Binary Search Tree..
class BST
{
    //creating a root node..
    Node root;
    public BST()
    {
        root = null;
    }
    //function to insert the data..
    public void insert(int data)
    {
        root = insertRec(root,data);
    }
    
    //recursive function for the insert..
    public Node insertRec(Node root,int data)
    {
        if(root==null)
        {
            root = new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left = insertRec(root.left,data); //for left subtree..
        }
        else if(data>root.data)
        {
            root.right = insertRec(root.right,data);  //for right subtree..
        }
        return root;
    }
    
    //inordr traversal of the BST..
    public void inorder()
    {
        inorderRec(root);
    }
    public void inorderRec(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorderRec(root.left);
        System.out.print(root.data+" ");
        inorderRec(root.right);
    }
}
class Main
{
    public static void main(String[]args)
    {
        BST tree = new BST(); //creating an object..
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorder();
    }
}

//This program is used to handle the duplicates of node in BST..

import java.util.*;
//create a node class.
class Node
{
   // int count;
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = right=null;
    }
}
//create a BST class..
class BinarySearchTree
{
    //create a root node.
    Node root;
    BinarySearchTree()
    {
        root=null;
    }
    
    //function to insert the node in BST.
    void insert(int data)
    {
        //System.out.println("Reached");
        root = insertRec(root,data);
    }
    Node insertRec(Node root,int data)
    {
        if(root==null)
        {
            root = new Node(data);
           // root.count=1;
            //root.left=root.right=null;
            return root;
        }
        else if(data==root.data)
        {
            //root.count++;
            return root;
        }
        else if(data<root.data)
        {
            root.left = insertRec(root.left,data);
        }
        else if(data>root.data)
        {
            root.right = insertRec(root.right,data);
        }
       // System.out.print("inserted\n");
        return root;
    }
    //function to check if the tree is continous or not..
    boolean conTree()
    {
        boolean res = conTreeRec(root);
        return res;
    }
    boolean conTreeRec(Node root)
    {
        //if the BST is empty..
        if(root==null)
        {
            return true;
        }
        //if only one node is there..
        if(root.left==null && root.right==null)
        {
            return true;
        }
        //if only left subtree is there..(so traverse in the left side only)
        if(root.right==null)
        {
            return (Math.abs(root.data-root.left.data)==1) && conTreeRec(root.left);
        }
        //if only right subtree is there..(so traverse in the right side only)
        if(root.left==null)
        {
            return (Math.abs(root.data-root.right.data)==1) && conTreeRec(root.right);
        }
        //if both the nodes are there..
        return Math.abs(root.data-root.left.data)==1 
               && Math.abs(root.data-root.right.data)==1 
               && conTreeRec(root.left) 
               && conTreeRec(root.right);                           
    }
    
    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorderRec(root.left);
        System.out.println(root.data+" "/*+"("+root.count+")"*/);
        inorderRec(root.right);
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("It's time for insertion in the BST..");
        /*tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);*/
        
        tree.insert(7);
        tree.insert(5);
        tree.insert(8);
        tree.insert(6);
        tree.insert(4);
        tree.insert(10);
        
        tree.inorder();
        boolean res = tree.conTree();
        System.out.println("Is the given BST continous :"+res);
    }
}

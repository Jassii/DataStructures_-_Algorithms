//This program is used to handle the duplicates of node in BST..

import java.util.*;
//create a node class.
class Node
{
    int count;
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
        Node temp = new Node(data);
        if(root==null)
        {
            root = temp;
            root.count=1;
            //root.left=root.right=null;
            return root;
        }
        else if(data==root.data)
        {
            root.count++;
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
        System.out.println(root.data+" "+"("+root.count+")");
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
        tree.insert(12);
        tree.insert(10);
        tree.insert(20);
        tree.insert(9);
        tree.insert(11);
        tree.insert(10);
        tree.insert(12);
        tree.insert(12);
        tree.inorder();
    }
}

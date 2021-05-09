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
    //function to delete the node..
    public void delete(int data)
    {
        root = deleteRec(root,data); //calling it's recursive function..
    }
    public static Node deleteRec(Node root,int data)
    {
        if(root==null)  //BinarySearchTree is empty..
        {
            return root;
        }
        
        if(root.data==data)  //if only one node is there..
        {
            if(root.left==null && root.right==null)
            {
              root = null;
              return root;
            }
            else //root node has to be deleted but root node is having children..
            {
                if(root.left==null && root.right!=null)  //right node is there.
                {
                    root.data = root.right.data;
                    root.right = null;
                    return root;
                }
                else if(root.right==null && root.left!=null) //left node is there.
                {
                    root.data = root.left.data;
                    root.left=null;
                    return root;
                }
                else  //when both the childeren are there..
                {
                   // node with two children: Get the inorder
                   // successor (smallest in the right subtree)
                   root.data = minValue(root.right); //minimum value in the right subtree..
                   
                   // And after that delete the right subtree..
                   root.right = deleteRec(root.right,root.data);
                }
                return root;
            }
        }
        //recur down the tree..
        //we will check if the node to be deleted is smaller or greater than the root node or not..
        if(data<root.data)
        {
            root.left = deleteRec(root.left,data);
        }
        else if(data>root.data)
        {
            root.right = deleteRec(root.right,data);
        }
        return root;
    }
    //inorder to find the minimum value from the right subtree..
    static int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
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
        
        System.out.println("After insertion BST is..");
        tree.inorder();
        tree.delete(20);
        System.out.println("\n After deletion BST is..");
        tree.inorder();
        tree.delete(30);
        System.out.println("\n After deletion BST is..");
        tree.inorder();
        tree.delete(50);
        System.out.println("\n After deletion BST is..");
        tree.inorder();
        
    }
}

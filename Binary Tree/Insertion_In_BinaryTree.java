import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
        left=right=null;
    }
}
class BinaryTree
{
    //create a root node.
    Node root;
    public BinaryTree()
    {
        root = null;
    }
    public BinaryTree(int data)
    {
        root = new Node(data);
    }
    
    //inorder traversal of the tree..
    public void inorderT(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorderT(root.left);
        System.out.print(root.data+" ");
        inorderT(root.right);
    }
    
    //function to insert element in the binary tree..
    public void insert(int data)
    {
        Node node = new Node(data);  //created a node which will be inserted..
        if(root==null)//if tree is empty..
        {
            root=node;
            return;
        }
        Queue<Node> q = new LinkedList<Node>(); //creating a queue..
        Node temp = root;  //will be used for traversal..
        q.add(temp);  //enqueue root node in the queue..
        
        // Do ****level order traversal**** until we find
        // an empty place.
        while(!q.isEmpty())  //untill queue is empty..
        {
            temp = q.peek();
            q.remove();
            
            if(temp.left==null)
            {
                temp.left = node;
                break;
            }
            else
            {
               q.add(temp.left); //as left is not empty insert it in the queue..    
            }
            if(temp.right==null)
            {
                temp.right = node;
                break;
            }
            else
            {
                q.add(temp.right);
            }
        }
    }
    //fucntion for **deleting** any node from the BinaryTree..
   public void delete(int data)
    {
        Node temp = root;
        if(temp==null)  //when the binary tree is itself an emptytree..
        { 
            System.out.println("BT is empty");
            return;
        }
        if(temp.left==null && temp.right==null) //only one node is there.
        {
            if(temp.data==data) //if the node matches with the data..
            {
                temp=null;
                return;
            }
            else
            {
                return;
            }
        }
        
        //now we will traverse the BinaryTree inorder to get the node to be deleted..
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        
        Node keyNode = null;  //this will store the (node to be deleted)..
        
        while(!q.isEmpty())//till we have traversed the end..
        {
            temp = q.peek();
            q.remove();
            if(temp.data==data)
            {
                keyNode = temp;
                //return;
            }
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        //this (while) will tell us that the node to be deleted is stored in (keyNode) Node..
        
        if(keyNode!=null)  //yes that it ahs found the node which has to be deleted..
        {
            int x = temp.data;  //data of the last node..
            keyNode.data = x; //assigning data of the last node to the node which was to be deleted
            deleteDeepest(root,temp);  //function called to remove the deepest and rightmost node..of BT..
            
        }
    }
    
    public void deleteDeepest(Node root,Node last)
    {
        //traverse till the last node..
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        Node temp = root;
        while(!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            if(temp==last)
            {
                temp=null;
                return;
            }
            if(temp.right!=null)
            {
                if(temp.right==last)
                {
                    temp.right=null;
                    return;
                }
                else
                {
                    q.add(temp.right);
                }
            }
            if(temp.left!=null)
             {
                 if(temp.left==last)
                 {
                     temp.left=null;
                     return;
                 }
                 else
                 {
                     q.add(temp.left);
                 }
             }
        }
    }//end of deleteDeepest function..
    
    //function to calculate the size of the tree..(number of nodes present)..
    public int size(Node root)  
    {
        if(root==null)
        {
            //System.out.println("Size of subtree is zero as Binary Tree is empty.");
            return 0;
        }
        else
        {
            int lh = size(root.left);  //calculating the height of left subtree..
            int rh = size(root.right); //calculating the height of right subtree..
            int tree_size = lh + 1 + rh;  //+1 for the root node..
            return tree_size;
        }
    }
    
    //function to find the node having the maximum value or data..
    public int max(Node root)
    {
        if(root==null)
        {
           // System.out.println("Empty BT");
            return Integer.MIN_VALUE;
        }
        if(root.left==null && root.right==null)
        {
            //System.out.println("Node having max data is root node with : "+root.data+" value..");
            return root.data;
        }
        int res = root.data; //data at the root node...
        
        int lmax = max(root.left);
        int rmax = max(root.right);
        if(lmax>res)
        {
            res = lmax;
        }
        if(rmax>res)
        {
            res = rmax;
        }
        return res;
    }
    
    //function to find the node having the minimum value or data..
    public int min(Node root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        
        int res = root.data;
        
        int lmin = min(root.left);
        int rmin = min(root.right);
        if(lmin<res)
        {
            res = lmin;
        }
        if(rmin<res)
        {
            res = rmin;
        }
        return res;
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree(); //creating an object of BinaryTree..
        tree.root = new Node(13);
        tree.root.left = new Node(12);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(9);
        System.out.println("Inorder traversal before the insertion ");
        tree.inorderT(tree.root);
        tree.insert(19);
        System.out.println("\nInorder traversal after the insertion ");
        tree.inorderT(tree.root);
        System.out.println("\nInorder traversal after the deletion ");
        //deleting function..
        tree.delete(12);
        tree.inorderT(tree.root);
        
        int s = tree.size(tree.root);
        
        System.out.println("\nSize of subtree is "+s);
        
        int max = tree.max(tree.root);
        System.out.println("Node having max data is "+max);
        
        int min = tree.min(tree.root);
        System.out.println("Node having min data is "+min);
    }
}

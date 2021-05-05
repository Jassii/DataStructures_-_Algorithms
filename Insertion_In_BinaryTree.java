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
   /* public void delete(int data)
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
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        Node keyNode = null;  //this will store the node to be deleted..
        while(!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            if(temp.data==data)
            {
                keyNode = temp;
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
        if(keyNode!=null)  //when we have found the node which has to be deleted.
        {
            int x = temp.data;  //data of the last node..
            deleteDeepest(root,temp);
            keyNode.data = data;
        }
    }
    public void deleteDeepest(Node root,Node last)
    {
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
                 }
                 else
                 {
                     q.add(temp.left);
                 }
             }
        }
    }*/
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree(); //creating an object of BinaryTree..
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Inorder traversal before the insertion ");
        tree.inorderT(tree.root);
        tree.insert(5);
        System.out.println("\nInorder traversal after the insertion ");
        tree.inorderT(tree.root);
        System.out.println("\nInorder traversal after the deletion ");
        //deleting function..
        //tree.delete(5);
        //tree.inorderT(tree.root);
    }
}

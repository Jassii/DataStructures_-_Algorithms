import java.util.*;
//creating a class node..
class Node
{
    int data;
    Node left;
    int height;
    Node right;
    Node(int data)
    {
        height=0;
        this.data=data;
        left = right = null;
    }
}
//creating a BinaryTree class ..
class BinaryTree
{
    Node root; 
    BinaryTree()
    {
        root= null;
    }
    BinaryTree(int data) //here root will be provided the value..and if not it will be provided in the insert method..
    {
        root = new Node(data);
    }
    void insert(int data)
    {
        Node node = new Node(data);//new node is created.
        if(root==null)
        {
            root = node;
            return;
        }
        Queue<Node> q = new LinkedList<Node>(); //this will contain the node..
        Node temp = root; //this will be used for traversal..
        q.add(temp);
        
        //do level order traversal untill we find the empty space..
        while(!q.isEmpty())
        {
            temp = q.peek(); //will return the top Node..
            q.remove();//it will remove the top Node..
            if(temp.left==null)
            {
                temp.left = node;
                break;
            }
            else
            {
                q.add(temp.left);
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
    
    //function to get the TOP VIEW of the BinaryTree..
    void topView()
    {
        Node temp = root;
        if(temp==null)
        {
            return;
        }
        //if it is not empty..Then take a TreeMap..
        TreeMap<Integer,Integer> tm = new TreeMap<>(); //created a tree map which will store(key(height),data)..
        Queue<Node> q = new LinkedList<>();  //will take each node inside and traverse till the end..
        //add the root node inside the queue.
        q.add(temp);
        
        //traverse it untill the queue is empty..
        while(!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            int hd = temp.height; //will store the height of each node..
            //check if the same height value is present in the Tree map or not..
            if(tm.get(hd)==null)//if it is not there..
            {
                tm.put(hd,temp.data);
            }
            //suppose if the left side of the root is not empty..
            if(temp.left!=null)//(moving to the left side of the tree..)
            {
                temp.left.height=hd-1;//just decrease the value of the height..
                q.add(temp.left);
            }
            if(temp.right!=null)//(moving to the right side of the tree..)
            {
                temp.right.height=hd+1;
                q.add(temp.right);
            }
        }
        //after this while loop...(Tree map will store the heights and data of the respective nodes from the top view)
        System.out.println(tm.values()); //inorder to get the values of the map..(.values() function is used..)
    }
    //function to print the left view of the binary tree..
    void leftView()
    {
        Node temp = root;
        if(temp==null)
        {
            return;
        }
        
        TreeMap<Integer,Integer> m = new TreeMap<>();  //created a tree map..which will store the (height,data)..
        Queue<Node> q = new LinkedList<>();//it will store the data of each node of BinaryTree..
        q.add(temp);
        //traverse till the end..
        while(!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            int h = temp.height;
            if(m.get(h)==null)  //for the very first node..
            {
                m.put(h,temp.data);
            }
            if(temp.left!=null)
            {
                temp.left.height = h+1;
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                temp.right.height = h+1;
                q.add(temp.right);
            }
        }
        System.out.println(m.values()); //this will print the data of each node visible from the left..
    }
    
    //for inorder traversal..
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
        System.out.print(root.data+" ");
        inorderRec(root.right);
    }
}
//main class..
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        
        tree.inorder();
        System.out.println("Following nodes are the top view of the binary tree..");
        tree.topView();
    }
}

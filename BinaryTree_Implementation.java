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
    //understanding about the traversal..(-------**Using Recursion**---------)
    //preorder traversal...
    public void preTraversal(Node root)  //(root-->left-->right)..
    {
        if(root==null)
        {
            //System.out.println("Binary Tree is empty");
            return;
        }
        System.out.print(root.data+" ");
        preTraversal(root.left);
        preTraversal(root.right);
    }
    
    //postorder traversal...
    public void posTraversal(Node root) //(left-->right-->root)..
    {
        if(root==null)
        {
            return;
        }
        posTraversal(root.left);
        posTraversal(root.right);
        System.out.print(root.data+" ");
    }
    
    //inorder traversal...
    public void inTraversal(Node root)   //(left-->root-->right)..
    {
        if(root==null)
        {
            return;
        }
        inTraversal(root.left);
        System.out.print(root.data+" ");
        inTraversal(root.right);
    }
    
    //Inorder tree traversal without recursion..
    public void InWRec()
    {
        if(root==null)
        {
            return;
        }
        
       Stack<Node> stack = new Stack<Node>(); //creating a stack..
       Node current = root;
       //traverse the tree..
       while(current!=null || stack.isEmpty()==false)  //current is not null and stack is not empty..
       {
           while(current!=null)
           {
              stack.push(current); //push the data untill it is null..
              current = current.left;    
           }
           current = stack.pop(); //pop the topmost item..
           System.out.print(current.data+" ");
           current = current.right;
       }
    }
}

class Main//main class..
{
    public static void main(String[]args)  //main method..
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();  //creating an object.
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("PreOrder Traversal of the tree is ");
        tree.preTraversal(tree.root);
        System.out.println("\nPostOrder Traversal of the tree is ");
        tree.posTraversal(tree.root);
        System.out.println("\nInOrder Traversal of the tree is ");
        tree.inTraversal(tree.root);
        
        tree.InWRec();
        
    }
}

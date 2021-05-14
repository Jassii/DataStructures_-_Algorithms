import java.util.*;
//creating a node class..
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
//creating BST class..
class BinarySearchTree
{
    //Index index = new Index();
    Node root;
    BinarySearchTree()
    {
        root=null;
    }
    //function for creating the bst..
    Node createBST(int pre[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        //creating a root node..
        Node root = new Node(pre[start]);  //from the first value..
        //now it's time to find the index of that element which is greater than the data at the root node..
        int i;
        for(i=start;i<=end;i++)
        {
            if(pre[i]>root.data)
            {
                break;
            }
        }
        root.left = createBST(pre,start+1,i-1);
        root.right = createBST(pre,i,end);
        return root;
    }
    //for traversal..
    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();  //creating an object to call BinarySearchTree class..
        int pre[] = {10, 5, 1, 7, 40, 50};  //array for preorder traversal..
        Node root = tree.createBST(pre,0,pre.length-1);
        tree.inorder(root);
    }
}

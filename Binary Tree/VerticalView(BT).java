import java.util.*;
//node class is created..
class Node
{
  int data;
  Node left;
  Node right;
  int height;
  public Node (int data)
  {
    this.data = data;
    left = right = null;
    this.height=0;
  }
}
//BinaryTree class is created..
class BinaryTree
{
  //create a root node..
  Node root;
  public BinaryTree ()
  {
    root = null;
  }
  public BinaryTree (int data)
  {
    root = new Node (data);
  }
  public void insert (int data)
  {
    Node node = new Node (data);	//new node created..
    //Node temp = root;		//this will be used for traversing..
    if (root == null)		//if BinaryTree is empty..
      {
	root = node;
	return;
      }
    //do level order traversal...inorder to find the empty space..
    Queue < Node > q = new LinkedList < Node > ();	//created a queue..
    q.add (root);
    Node temp=root;
    while (!q.isEmpty ())
      {
	temp = q.peek ();
	q.remove ();
	if (temp.left == null)
	  {
	    temp.left = node;
	    break;
	  }
	else
	  {
	    q.add (temp.left);
	  }
	if (temp.right == null)
	  {
	    temp.right = node;
	    break;
	  }
	else
	  {
	    q.add (temp.right);
	  }
      }
  }
  
  //vertical view...
  public void verticalView()
  {
      Node temp = root;
      if(temp==null)
      {
          return;
      }
      TreeMap<Integer,List<Integer>> M = new TreeMap<>();  
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty())
      {
          temp = q.peek();
          q.remove();
          int h = temp.height;
          if(M.containsKey(h))
          {
              M.get(h).add(temp.data);
          }
          else
          {
              List<Integer> l = new LinkedList<>();
              l.add(temp.data);
              M.put(h,l);
          }
          if(temp.left!=null)
          {
              temp.left.height = h-1;
              q.add(temp.left);
          }
          if(temp.right!=null)
          {
              temp.right.height = h+1;
              q.add(temp.right);
          }
      }
      for(Map.Entry<Integer,List<Integer>> entry:M.entrySet())
      {
          System.out.println(entry.getKey()+" --> "+entry.getValue());
      }
  }
  public void inorder (Node root)
  {
    if (root == null)
      {
	return;
      }
    inorder (root.left);
    System.out.print (root.data + " ");
    inorder (root.right);
  }
}

class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    BinaryTree tree = new BinaryTree ();
    int i;
      tree.insert(20);
      tree.inorder (tree.root);
      System.out.println();
 tree.insert(2);
 tree.insert(3);
 tree.insert(7);
 tree.insert(8);
 tree.insert(9);
 tree.insert(10);
 tree.inorder (tree.root);
 tree.verticalView();
  }
}

import java.util.*;
//we are doing this with the help of adjacency list..
class Graph
{ 
    List<List<Integer>> graph;  //list of list containing the edges of the graph..
    boolean visited[];  //to check if the edge is visited or not..
    boolean recursiveStack[];  //it will behave like a stack..
    int nodes;  //number of nodes in the graph..
    public Graph(int nodes)
    {
        graph = new ArrayList<>();  //initializing the list that it is the blank list..
        visited = new boolean[nodes];
        recursiveStack = new boolean[nodes];
        this.nodes = nodes;  
        
        for(int i=0;i<nodes;i++)
        {
            graph.add(i,new ArrayList<>());  //storing list of lists..
        }
    }
    public void addEdge(int u,int v)
    {
        //As it is a Directed graph we are adding the edges in only one direction..
        graph.get(u).add(v); //it will get the list at u and it will add  v in that list....
    } 
    
    //this function will check if there is any cycle or not..
    public boolean ifDirectedGraphCycle()  //this is the main..
    {
         int i;
         //for each index we have to check whether there is a cycle or not..
         for(i=0;i<nodes;i++)  //travserse all the nodes..
         {
            if(dfs(i))   //call the dfs function ...no use of the parent here.. 
            {
                return true;
            }
         }
         return false;
    }
    
    //dfs function..this will traverse each list..
    public boolean dfs(int index)  
    {
        //first check in the recursive stack..whether it is there or not.(if it is there return true..)
        if(recursiveStack[index])  //it means that there is a cycle..
        {
            return true;
        }
        //if it is not in the recursiveStack..but it is already visited..return false..
        if(visited[index])  //false in recursiveStack and true in visited array...means that there is no cycle.
        {
            return false;
        }
        //if nothing satisfies from the above conditions..
        visited[index] = true;
        recursiveStack[index] = true;
        
        //now get the neighbours of the element at the index..
        List<Integer> children = graph.get(index);  //this will return the list of neighbours.
        //not traverse the neighbors.
        for(Integer child:children)
        {
            if(dfs(child))  //recursive operation..if it is visited or not or in recursive stack or not..etc..
            {
                return true;
            }
        }
        //if the element at the index has no children..then simply put "false" on that index in recursiveStack..
        recursiveStack[index] = false;
        return false; //there is no cycle..
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        int nodes = 5;  //how many nodes are there in an undirected graph..
        Graph a = new Graph(nodes);  //add the edges in the form of adjacecny list..
        a.addEdge(0,1);
        a.addEdge(1,2);
        a.addEdge(2,0);
        a.addEdge(0,3);
        a.addEdge(3,4);
        a.addEdge(4,0);

        boolean is = a.ifDirectedGraphCycle();   //this will check if there is any cycle or not..
        if(is==true)  //yes there is a cycle..
        {
            System.out.println("There is a cycle..");
        }
        else
        {
            System.out.println("There is no cycle..");
        }
        
    }
}

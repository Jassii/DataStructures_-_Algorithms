import java.util.*;
//we are doing this with the help of adjacency list..
class Graph
{ 
    List<List<Integer>> graph;  //list of list containing the edges of the graph..
    boolean visited[];  //to check if the edge is visited or not..
    int nodes;  //number of nodes in the graph..
    public Graph(int nodes)
    {
        graph = new ArrayList<>();  //initializing the list that it is the blank list..
        visited = new boolean[nodes];
        this.nodes = nodes;  
        
        for(int i=0;i<nodes;i++)
        {
            graph.add(i,new ArrayList<>());  //storing list of lists..
        }
    }
    public void addEdge(int u,int v)
    {
        //As it is the undirected graph we are adding the edges in both the directions..
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public boolean ifUndirectedGraphCycle()  //this is the main..
    {
         int i;
         for(i=0;i<nodes;i++)  //travserse all the nodes..
         {
             if(!visited[i])  //if is not visited..
             {
                 if(dfs(i,-1))   //call the dfs function ... -1 because the parent for the first node is not there..
                 {
                     return true;
                 }
             }
         }
         return false;
    }
    
    public boolean dfs(int index,int parent)  //dfs function..this will traverse the each list..
    {
        //first element at the index will be visited..
        visited[index] = true;
        //now get the neighbors of the element visited..
        List<Integer> neigh = graph.get(index);
        for(Integer child : neigh)  //traverse the neighbors..
        {
            if(!visited[child])//if the neighbor is not visited..
            {
                if(dfs(child,index))
                {
                    return true;
                }
            }
            //now it means that it is visited..
            else if(child!=parent)
            {
                return true;  //that there is a cycle..
            }
        }
        return false; //no cycle is there in an undirected graph..
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        int nodes = 5;  //how many nodes are there in an undirected graph..
        
        Graph a = new Graph(nodes);  //add the edges in the form of adjacecny list..
        a.addEdge(0,4);
        a.addEdge(1,2);
        a.addEdge(1,4);
        a.addEdge(2,3);
        a.addEdge(3,4);
        
        boolean is = a.ifUndirectedGraphCycle();   //this will check if there is any cycle or not..
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

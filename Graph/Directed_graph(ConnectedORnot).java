import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        Graph G = new Graph(n);
        G.addEdge(0,1);
        G.addEdge(0,3);
        G.addEdge(1,2);
        G.addEdge(2,0);
        G.addEdge(3,2);
        
        boolean is = G.isConnected_Dir();
        if(is==false)
        {
            System.out.println("Directed Graph is not strongly connected..");
        }
        else
        {
            System.out.println("Directed Graph is strongly connected..");
        }
    }
}
class Graph
{
    int nodes;
    List<List<Integer>> graph;
    boolean visited[];
    public Graph(int nodes)
    {
        this.nodes = nodes;
        graph = new ArrayList<>();
        visited = new boolean[nodes];
        int i;
        for(i=0;i<nodes;i++)
        {
            graph.add(i,new ArrayList<>());
        }
    }
    
    public void addEdge(int u,int v)
    {
        //as it is a directed graph..
        graph.get(u).add(v);
    }
    
    public boolean isConnected_Dir()
    {
        int i,j;
        for(j=0;j<nodes;j++)
        {
           dfs(j);   //for particular node..checking if it reaches all the other nodes...
           
           for(i=0;i<nodes;i++)  //checking if it was able to reach all other nodes..
           {
               if(!visited[i])  //if any of them is false..it will return false..
               {
                   return false;
               }
           }
           Arrays.fill(visited,false);  //As now it will be checking for the new node..so visited array should be false.
        }
      return true;
    }
    
    public void dfs(int start)
    {
        
        //one method is to use stack..
        Stack<Integer> stack = new Stack<>();  //stack created..
        stack.push(start);
        visited[start] = true;
        while(!stack.isEmpty())
        {
            int node = stack.pop();
            //get the neighbours of the node.
            List<Integer> children = graph.get(node);
            for(Integer child:children)
            {
                if(!visited[child])
                {
                    stack.push(child);
                    visited[child] = true;
                }
            }
        }
        
        //another method is to use recursion..
        
        visited[start] = true;
        List<Integer> children = graph.get(start);
        for(Integer child:children)
        {
            if(!visited[child])
            {
                dfs(child);
            }
        }
    }
}

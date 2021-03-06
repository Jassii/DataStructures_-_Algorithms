/*----------------------------------------------------------------CODING SIMPLIFIED METHOD-----------------------------------------------------------------*/

/*import java.util.*;
class Graph
{
    ArrayList<ArrayList<Integer>> list; //adjacency list..
    boolean visited[];  //whether the node is visited or not..
    Stack<Integer> s = new Stack<>();  
    public Graph(int V)
    {
        list = new ArrayList<>();
        visited = new boolean[V];
        int i;
        for(i=0;i<V;i++)  //here we are creating a blank list of each index..
        {
            list.add(i,new ArrayList<>());
        }
    }
     //function to add the edges..
    public void addEdge(int u, int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    
    
    //function to print the DFS traversal of the GRAPH..
    public void dfs(int start)
    {
        s.push(start);  //starting index..
        visited[start]=true;
        
        while(!s.isEmpty()) //untill the stack is empty..
        {
            Integer v = s.pop();
            System.out.println(v+" ");//print the first element..
            
            List<Integer> l = list.get(v);  //getting the list associated with the index..(neighbors..)
            for(Integer child : l)  //traversing the list of the index..
            {
                if(!visited[child])  //if the neighbor is not visited..(having value false..)
                {
                    s.push(child);  //push in the stack..
                    visited[child]=true;
                }
            }
         }
    }
}

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
    
        //number of vertices.
        int V = 7;  //how many nodes do we have..
    
        Graph G = new Graph(V);
        
        //add the edges of the graph...
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 3);
        G.addEdge(2, 4);
        G.addEdge(3, 5);
        G.addEdge(4, 5);
        G.addEdge(4, 6);
        
        G.dfs(0); //here I am telling what is my starting index of the graph... 
    }
}*/

/*-------------------------------------------------------------GEEKS FOR GEEKS METHOD-------------------------------------------------------------*/

import java.util.*;
class Graph
{
    private int V;  //number of vertices..
    List<List<Integer>> list;
    public Graph(int v)
    {
        V = v;
        list = new ArrayList<>();
        int i;
        for(i=0;i<v;i++)
        {
            list.add(i,new ArrayList<>());
        }
    }
    
    public void addEdge(int u, int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    
    public void dfs(int start)
    {
        boolean visited[] = new boolean[V];
        utilDfs(start,visited);
    }
    
    public void utilDfs(int v,boolean visited[])
    {
        visited[v] = true;
        System.out.print(v+" ");
        
        //not checking its list..
       // List<Integer> l = list.get(v);  //this returns the list of the specific index..
        /*Iterator<Integer> i = list.get(v).listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                utilDfs(n, visited);
        }*/
        
        List<Integer> l = list.get(v);
        int i;
        for(i=0;i<l.size();i++)
        {
            int k = l.get(i);
            if(!visited[k])
            {
                utilDfs(k,visited);
            }
        }
        
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Graph G = new Graph(4);
        
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 2);
        G.addEdge(2, 0);
        G.addEdge(2, 3);
        G.addEdge(3, 3);
        
        G.dfs(2);
    }
}

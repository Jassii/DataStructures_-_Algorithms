import java.util.*;
class Graph
{
    int nodes;  //number of nodes..
    List<List<Integer>> graph;  //adjacency list..
    Map<Integer,Integer> inDegree;  //it will store the values of the incoming edges on each node..
    Queue<Integer> sourceQueue;
    public Graph(int nodes)
    {
        this.nodes = nodes;
        graph = new ArrayList<>();  //initializing the list..
        inDegree = new HashMap<>(); //initializing the map..
        sourceQueue = new LinkedList<>();  //this will tell about the source which has 0 incoming degree..
        int i;
        for(i=0;i<nodes;i++)
        {
            graph.add(i,new ArrayList<>());
            inDegree.put(i,0);  //initially indegree will br zero for all the nodes..
        }
    }
    public void addEdge(int u,int v)
    {
        //as it is a directed graph..
        graph.get(u).add(v);  //for the list..
        inDegree.put(v,inDegree.get(v)+1);
    }
    public List<Integer> topologicalSort()
    {
        //first i have to get to know..that which of the nodes have incoming degree as 0.
        for(Map.Entry<Integer,Integer> entry:inDegree.entrySet())
        {
            if(entry.getValue()==0)
            {
                sourceQueue.add(entry.getKey());  //add the key..
            }
        }
        //now creating the result list..
        List<Integer> result = new ArrayList<>();
        //traverse utill the queue is empty.
        while(!sourceQueue.isEmpty())
        {
           int source = sourceQueue.remove();
           result.add(source);  //add the source node..
           
           //now finding the neighbours of the source node.
           List<Integer> children = graph.get(source);
           for(Integer child:children)
           {
               //now i am actually removing the incoming edge by 1.inorder to find the source node..
               inDegree.put(child,inDegree.get(child)-1);
               
               if(inDegree.get(child)==0)  //if the inDegreeis 0..then simply add into the queue..
               {
                   sourceQueue.add(child);
               }
           }
        }
        return result;
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int nodes = 6;
        Graph G = new Graph(nodes);
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(1,3);
        G.addEdge(1,4);
        G.addEdge(2,4);
        G.addEdge(3,5);
        G.addEdge(4,5);
        
        System.out.println(G.topologicalSort());  //topologicalSort..
    }
}

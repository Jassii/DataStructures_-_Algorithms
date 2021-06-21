import java.util.*;
class Graph
{
    int nodes;  //number of nodes..
    List<List<Integer>> graph;  //adjacency list..
    boolean visited[];
    
    public Graph(int nodes)
    {
        this.nodes = nodes;
        graph = new ArrayList<>();  //initializing the list..
        visited = new boolean[nodes];  //initializing the visited array..
        int i;
        for(i=0;i<nodes;i++)
        {
            graph.add(i,new ArrayList<>());
        }
        
    }
    public void addEdge(int u,int v)
    {
        //as it is an Un-Directed graph..
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    
    public int minDistance(int start, int target)
    {
        //there can be one case when start index == target index.
        if(start==target)
        {
            return 0;  //minimum distance..
        }
        
        //if it is not the case..then i will do BFS..on the graph.
        Queue<Integer> queue = new LinkedList<>();
        
        int minDistance = 0;
        queue.add(start);  //add the start index..(putting the source into queue).
        while(!queue.isEmpty())
        {
            //calculate the size of the queue..
            int size = queue.size();  //calculating the size of the queue..
            
            while(size>0)  //till one layer is complete..
            {
                //here we are doing for a particular node..(index.)
                Integer node = queue.poll();
                
                //get the neighbours of that the node.
                List<Integer> children = graph.get(node);
                
                for(Integer child:children) //traverse the neighbour..
                {
                    if(child==target)  //if the neighbour matches with the target..
                    {
                        return ++minDistance;  //when it matches simply return minDistance...
                    }
                    
                    //check if the child is visited or not..
                    if(!visited[child])
                    {
                        queue.add(child);
                        visited[child] = true;
                    }
                }
                //when the neighbours of one node is visited..then simply decrease the size..of that layer..
                size--;
            }
            
            //after convering on each layer..
            
            //it will come out from the while loop when the size =0;
            minDistance++;  //increase the minDistance.
        }
        return -1; //suppose the graph is not connected..then we have to return -1..
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int nodes = 6; //number of nodes..
        Graph G = new Graph(nodes);
        //add the edges..
        G.addEdge(0,1);
        G.addEdge(0,3);
        G.addEdge(1,2);
        G.addEdge(3,4);
        G.addEdge(2,4);
        G.addEdge(4,5);
        
        System.out.println(G.minDistance(0,5));  //minimum Minimum Distance..(passing the source and target.)
    }
}

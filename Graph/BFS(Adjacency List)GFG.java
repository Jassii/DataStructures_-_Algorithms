import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int v = 4;  //this tells about the number of vertices..
        Graph G = new Graph(v);
        
        G.addEdge(0,1);
        G.addEdge(0,2);
        G.addEdge(1,2);
        G.addEdge(2,0);
        G.addEdge(2,3);
        G.addEdge(3,3);
        
        G.bfs(2);  //start position is also passed..
    }
}
class Graph
{
    int V;
    List<List<Integer>> List;  //list..(Containing the neighbors..)
    public Graph(int v)
    {
        V = v;  //total number of vertices.
        List = new ArrayList<>(); 
        int i;
        for(i=0;i<v;i++)
        {
            List.add(i,new ArrayList<>());
        }
    }
    
    public void addEdge(int u, int v)  //when you have to add the edges..
    {
        List.get(u).add(v);
        List.get(v).add(u);
    }
     
    //breadth first search traversal in the graph using Adjacency List 
    public void bfs(int start)
    {
        boolean visited[] = new boolean[V];  //this is for checking whether it is visited or not..
        
        Queue<Integer> Q = new LinkedList<>();//created a queue..
        
        visited[start] = true; //that the start index is visited..
        Q.add(start);
        
        while(!Q.isEmpty())//untill the queue is empty..
        {
            start = Q.poll(); //first element.
            System.out.print(start+" ");  //print it..
            
            List<Integer> list = List.get(start);
            int i;
            for(i=0;i<list.size();i++)  //travering the neighbors of the element..
            {
                int k = list.get(i);
                if(!visited[k])
                {
                    visited[k]=true;
                    Q.add(k);
                }
            }
        }
    }
}

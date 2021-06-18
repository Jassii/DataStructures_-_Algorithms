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
        //As it is an UnDirected graph we are adding the edges in both the directions..
        graph.get(u).add(v); //it will get the list at u and it will add  v in that list....
        graph.get(v).add(u);
    } 
    
    //this function will check if there is any cycle or not..
    public boolean isConnected()  //this is the main..
    {
         //pass the start index of the graph..
         int startIndex = 0;
         
         this.dfs(startIndex);  //this will traverse the graph and put boolean values to the visited array..
         
         int i;
         for(i=0;i<visited.length;i++)
         {
             if(!visited[i])  //if any of the element is false..then it means that it is not visited..
             {
                 return false;
             }
         }
         return true;
    }
    
    //dfs function..this will traverse each list..
    public void dfs(int start)  
    {
        //create a stack.
        Stack<Integer> stack = new Stack<>();  //this will store the values present in the graph..
        stack.push(start);
        visited[start] = true;  //first node passed will be visited..
        
        while(!stack.isEmpty())  //untill stack is empty..traverse it..
        {
            Integer node = stack.pop();  //top element..
            //get the neighbours of the node.. 
            List<Integer> children = graph.get(node);
            for(Integer child:children)  //traverse the neighbours..
            {
                if(!visited[child])  //if it is not visited..
                {
                    stack.push(child);  //push into the stack..
                    visited[child] = true;  
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
        
        int nodes = 7;  //how many nodes are there in an undirected graph..
        Graph a = new Graph(nodes);  //add the edges in the form of adjacecny list..
        a.addEdge(0,1);
        a.addEdge(1,3);
        a.addEdge(3,5);
        a.addEdge(4,5);
        a.addEdge(2,4);
        a.addEdge(0,2);
        a.addEdge(4,6);

        boolean is = a.isConnected();   //this will check if there is any cycle or not..
        if(is==true)  //yes there is a cycle..
        {
            System.out.println("Given Undirected Graph is connected...");
        }
        else
        {
            System.out.println("Not Connected...");
        }
        
    }
}

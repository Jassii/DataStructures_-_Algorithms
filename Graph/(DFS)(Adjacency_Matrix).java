import java.util.*;

//this Vertex class is used for storing the label and checking visit..(A or B or C etc..)
class Vertex
{
    public char label;  
    public boolean wasVisited; //this will tell whether the node or element is visited or not..
    
    public Vertex(char label)
    {
        this.label = label;
        wasVisited = false;
    }
}

class Graph
{
    public final int MAX_VERTS = 20;  //limit of the vertices..
    public Vertex vertexList[];  //array of objects of class Vetex..
    public int adjMat[][];  //this will store 0 or 1..edge is there or not..
    
    public int nVert;  //this will be used for inputing the label(A or B or C etc..) in the (vertexList)....
    
    public Stack<Integer> s;  //this will be used at the time of DFS..
    
    public Graph()  //constructor..
    {
        vertexList = new Vertex[MAX_VERTS];  //creating a vertixlist.
        adjMat = new int[MAX_VERTS][MAX_VERTS];  //creating an adjacency matrix..
        nVert=0;
        s = new Stack<>();
    }
    
    public void addVertex(char label) //this function will help in add the vertex visited(A or B or C..)
    {
        vertexList[nVert] = new Vertex(label);
        nVert++;  //increase the index..
    }
    
    public void addEdge(int u,int v)  //this function will help in adding the edge..between the labels..
    {
        adjMat[u][v] = 1;  //yes it is occupied..
        adjMat[v][u] = 1;
    }
    
    public void displayVertex(int v) //this function will display the label at the respective index..
    {
        System.out.print(vertexList[v].label+" ");
    }
    
    //will return the neighbor which is unvisited..
    public int getAdjUnvisited(int v)
    {
        int i;
        for(i=0;i<nVert;i++)
        {
            if(adjMat[v][i]==1 && vertexList[i].wasVisited==false)
            {
                return i;
            }
        }
        return -1;
    }
    
    public void dfs()  //this will print the dfs of the graph..
    {
        //we are considering that the first label is visited..
        vertexList[0].wasVisited=true;
        displayVertex(0);
        
        s.push(0);//push the first index.
        
        while(!s.isEmpty())
        {
            int v = getAdjUnvisited(s.peek());  //this function will return the neighbor which is not visited.
            if(v==-1) //no vertex is there or it is visited..
            {
                s.pop(); //remove that index value..
            }
            else
            {
                vertexList[v].wasVisited=true;
                displayVertex(v);
                s.push(v);
            }
        }
    }
    
}

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Graph G = new Graph();  //As we are implementing the graph..
        
        //add the vertex..
        G.addVertex('A');
        G.addVertex('B');
        G.addVertex('C');
        G.addVertex('D');
        G.addVertex('E');
        G.addVertex('F');
        
        //now add the edge.
        G.addEdge(0,1);
        G.addEdge(1,2);
        G.addEdge(0,3);
        G.addEdge(3,4);
        G.addEdge(4,5);
        G.addEdge(1,3);
        
        System.out.println("Visits : ");
        G.dfs();   //Depth first search of the graph..(Traversal we can say.)
        System.out.println();
        
    }
}

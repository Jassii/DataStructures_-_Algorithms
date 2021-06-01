import java.util.*;

//this Vertex class is used for storing the label and checking visit..(A or B or C etc..)
class Vertex
{
   public char label;
   public boolean wasVisited;
   public Vertex(char label)
   {
       this.label = label;
       wasVisited = false;
   }
}

class Graph
{
    public final int MAX_VERT = 20;
    public Vertex verList[];
    public int adjMat[][];
    public int nVer;
    Queue<Integer> Q;
    
    public Graph()
    {
        verList = new Vertex[MAX_VERT];
        adjMat = new int[MAX_VERT][MAX_VERT];
        nVer = 0;
        //we will use Queue in the BFS..
        Q = new LinkedList<>(); 
    }
    
    public void addVertex(char label)
    {
       verList[nVer] = new Vertex(label); 
       nVer++;  //u have to increase the index value..
    }
    public void addEdge(int u,int v)
    {
        adjMat[u][v] = 1;
        adjMat[v][u] = 1;
    }
    
     public void displayVertex(int v)
    {
        System.out.print(verList[v].label+" ");
    }
    
    public int getAdjUnvisited(int v)
    {
        int j;
        for(j=0;j<nVer;j++)
        {
            if(adjMat[v][j]==1 && verList[j].wasVisited==false)
            {
                return j;
            }
        }
        return -1;
    }
    
    public void bfs()
    {
        verList[0].wasVisited=true;
        displayVertex(0);
        int v2;
        Q.add(0);
        while(!Q.isEmpty())
        {
            int v1 = Q.remove();
            while((v2=getAdjUnvisited(v1))!=-1)
            {
                verList[v2].wasVisited=true;
                displayVertex(v2);
                Q.add(v2);
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
       
        //now add the edges..
        G.addEdge(0,1);
        G.addEdge(1,2);
        G.addEdge(0,3);
        G.addEdge(3,4);
        G.addEdge(4,5);
        G.addEdge(1,4);
        
        System.out.println("Vertices: ");
        G.bfs();
        System.out.println();
    }
}

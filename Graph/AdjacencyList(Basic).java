import java.util.*;
class Main
{
    public static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    
    // A utility function to print the adjacency list
    // representation of graph
    public static void printEdge(ArrayList<ArrayList<Integer>> list)
    {
        int i;
        for(i=0;i<list.size();i++)
        {
            System.out.println("Adjacency List of vertex "+i);
            System.out.print("Head");
            int j;
            for(j=0;j<list.get(i).size();j++)
            {
                System.out.print(" -> "+list.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        //number of vertices..
        int V = sc.nextInt(); //this tells about the number of vertices present in the graph..
        
        //we will be using ArrayList(List of list)..
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i;
        
        //creating "empty" list of lists..of size V.
        for(i=0;i<V;i++)
        {
            list.add(new ArrayList<>()); //adding the object of the list..
        }
        System.out.println("Just checking what is happening over here "+list);
        //now its time to add the edges..
        // Adding edges one by one
        addEdge(list, 0, 1);
        addEdge(list, 0, 4);
        addEdge(list, 1, 2);
        addEdge(list, 1, 3);
        addEdge(list, 1, 4);
        addEdge(list, 2, 3);
        addEdge(list, 3, 4);
        
        System.out.println(list);
        
        printEdge(list);
        
    }
}

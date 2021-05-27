import java.util.*;
import java.lang.Math;
class Coordinate
{
    int x,y;
    public Coordinate(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int distanceFromOrigin()
    {
        //we can do this too..
       // return Math.sqrt(x*x + y*y);  //this is calculating the distance From the Origin.
                                      //(As sqrt funciton return double value..)
        return x*x + y*y;  //return the sum of square of both number..
    }
}
class Heap
{
    public List<Coordinate> kNearOriginList(List<Coordinate> l,int k)  //this function will return the list..
    {
        if(l.size()==0)  //if no co-ordinates is there..(empty list)
        {
            return new ArrayList<>();   //empty list is returned..
        }
        
        //now we will sort the list..(minHeap..)
        Collections.sort(l,(n1,n2) -> n1.distanceFromOrigin()-n2.distanceFromOrigin());  //this will sort the list
        
        //not creating a new list..(Which will contain the elements till k) which will be returned..
        
        List<Coordinate> result = new ArrayList<>();
        
        int i=0;
        while(i<l.size() && i<k)    //when searching index is greater than the size of the list..
        {
            result.add(l.get(i));
            i++;
        }
        return result;  //list will be returned..
    }
    
    //we can also do this with the help of MinHeap...
    public List<Coordinate> kNearOriginMinHeap(List<Coordinate> l, int k)
    {
        if(l.size()==0)
        {
            return new ArrayList<>();
        }
        PriorityQueue<Coordinate> P = new PriorityQueue<>((n1,n2)->n1.distanceFromOrigin()-n2.distanceFromOrigin());
        
        //now traverse the list and store each Coordinate in the PriorityQueue..
        
        for(Coordinate c:l)
        {
            P.add(c);
        }
        
        List<Coordinate> result = new ArrayList<>();
        
        int i=0;
        while(!P.isEmpty() && i<k)
        {
            result.add(P.peek());
            P.poll();
            i++;
        }
        return result;
    }
    
    //we can also do this with the help of MaxHeap...
    public List<Coordinate> kNearOriginMaxHeap(List<Coordinate> l, int k)
    {
        if(l.size()==0)
        {
            return new ArrayList<>();
        }
        PriorityQueue<Coordinate> P = new PriorityQueue<>((n1,n2)->n2.distanceFromOrigin()-n1.distanceFromOrigin());
        
        //now traverse the list and store each Coordinate in the PriorityQueue..
        
        int i;
        for(i=0;i<k;i++)
        {
            P.add(l.get(i));
        }
        
        for(i=k;i<l.size();i++)
        {
            if(l.get(i).distanceFromOrigin()>P.peek().distanceFromOrigin())
            {
                P.poll();
                P.add(l.get(i));
            }
        }
        
        List<Coordinate> result = new ArrayList<>();
        
        
        while(!P.isEmpty())
        {
            result.add(P.peek());
            P.poll();
            i++;
        }
        return result;
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Heap H = new Heap();
        
        int k = sc.nextInt();  //how much closest point is required..
        
        //These all are the co-ordinates..
        Coordinate C1 = new Coordinate(1,4);
        Coordinate C2 = new Coordinate(2,3);
        Coordinate C3 = new Coordinate(0,4);
        Coordinate C4 = new Coordinate(3,5);
        
        //now lets store all the points in the list..
        
        List<Coordinate> l = new ArrayList<>(); //list is created..
        l.add(C1);
        l.add(C2);
        l.add(C3);
        l.add(C4);
        
        List<Coordinate> nl = H.kNearOriginMinHeap(l,k);  //passed the list which contains all the points..
        
        for(Coordinate o:nl)  //this will actually return the Coordinates...
        {
            System.out.print(o.x+" "+o.y+" "+o.distanceFromOrigin());
            System.out.println();
        }
    }
}

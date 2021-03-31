import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int A[] = new int[10];
        for(i=0;i<5;i++)   //giving values to first five values in an array.
        {
            A[i] = sc.nextInt();
        }
        
        for(i=0;i<10;i++)  //printing values of an array..
        {
            System.out.print(A[i]+" ");
        }
        System.out.println("Now it's time for insertion");
        
        //inserting an element at a specific index..
        int n = sc.nextInt();  //index value..
        int k = sc.nextInt();//value to be stored..
        for(i=A.length-1;i>=n;i--)  //value is shifted to the right from the specified index..
        {
            A[i]=A[i-1];
        }
        
        A[n-1] = k;  //inserting the value..
        for(i=0;i<10;i++)
        {
            System.out.print(A[i]+" ");
        }
        
        //deleting an element from an array..
        System.out.println("Now it's time for deletion");
        int index = sc.nextInt();//index from which value to be removed..
        for(i=index-1;i<A.length-1;i++)  //shifting the value to the left side...
        {
            A[i] = A[i+1];   //in upper we have done (A.length-1) because if (A[i+1]) if not -1 then exception(Array index out of bounds)...
        }
        for(i=0;i<10;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}

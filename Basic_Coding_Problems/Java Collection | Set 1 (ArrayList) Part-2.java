// Implement different operations on a ArrayList A .
 

// Input:
// The first line of input contains an integer T denoting the no of test cases . 
//  Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . 
//  Then in the next line are Q space separated queries .
// A query can be of five types 
// 1. a x (Adds an element x to the ArrayList A at the end )
// 2. b (Sorts the ArrayList A in ascending order )
// 3. c (Reverses the ArrayList A)
// 4. d (prints the size of the ArrayList)
// 5. e (prints space separated values of the ArrayList)
// 5. f  (Sorts the ArrayList A in descending order)


// Output:
// The output for each test case will  be space separated integers denoting the results of each query . 

// Constraints:
// 1<=T<=100
// 1<=Q<=100

// Example:

// Input
// 2
// 6
// a 4 a 6 a 7 b c e
// 4
// a 55 a 11 d e
 
// Output
// 7 6 4
// 2 55 11

// Explanation :
// For the first test case
// There are six queries. Queries are performed in this order
// 1. a 4 { ArrayList has 4  }
// 2. a 7 {ArrayList has 7 }
// 3. a 6 {ArrayList has 6}
// 4. b {sorts the ArrayList in ascending order, ArrayList now is 5 6 7}
// 5. c {reverse the ArrayList}
// 6. e {prints the element of the ArrayList 7 6 4}

// For the sec test case 
// There are four queries. Queries are performed in this order
// 1. a 55  (ArrayList A has 55}
// 2. a 11  (ArrayList A has 55 ,11}
// 3. d      (prints the size of the ArrayList A ie. 2 )
// 4. e      (prints the elements of the ArrayList A ie 55 11)


// Note:The Input/Output format and Example given are used for system's 
// internal purpose, and should be used by a user for Expected Output only. 
// As it is a function problem, hence a user should not read any input from stdin/console. 
// The task is to complete the function specified, and not to write the full code.

// { Driver Code Starts
import java.util.Scanner;
import java.util.*;

class ArrayList_Collection
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			ArrayList<Integer> A = new ArrayList<Integer>();
			int q = sc.nextInt();
			
			while(q>0)
			{
				char c = sc.next().charAt(0);
				GfG g = new GfG();
				if(c == 'a')
				{
					int x = sc.nextInt();
					g.add_to_ArrayList(A,x);
				}
				
				if(c == 'b')
					g.sort_ArrayList_Asc(A);
					
				if(c == 'c')
					g.reverse_ArrayList(A);
					
				if(c == 'd')
					System.out.print(g.size_Of_ArrayList(A)+" ");
					
				if(c == 'e')
					g.print_ArrayList(A);
				
				if(c == 'f')
					g.sort_ArrayList_Desc(A);
				
			q--;
			}
		T--;
		System.out.println();
		}
	}
}// } Driver Code Ends


/*You are required to complete below methods*/

class GfG
{
    /*inserts an element x at 
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
	// Your code here
	A.add(x); //this will insert the x at the end of the list 
    }	
	
    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
	// Your code here
	Collections.sort(A);
    }
	
    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
	// Your code here
	Collections.reverse(A);
	
    }
	
    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
	// Your code here
	return A.size();
    }
	
    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
	// Your code here
	Collections.sort(A,Collections.reverseOrder());
    }
	
    /*prints space separated 
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
        // Your code here
        int i;
        for(i=0;i<A.size();i++)
        {
            System.out.print(A.get(i)+" ");
        }
    }
}

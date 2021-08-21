// For a given N, prints the sum of even and odd integers of the first N natural numbers.

// Example 1:

// Input:
// N = 1
// Output:
// 0 1
// Explanation:
// Natural numbers less than 1 are only 1.
// So the sum of even number = 0.
// and the sum of odd number = 1.
// Example 2:

// Input:
// N = 6
// Output:
// 12 9  
// Explanation:
// Natural numbers less than 6 are 
// 1 2 3 4 5 6
// So the sum of even number = 2 + 4 + 6 = 12.
// and the sum of odd number = 1 + 3 + 5 = 9.
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function getSum() which takes an integer N as input parameter and return the sum of even and odd natural number less than equal to N.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N)
    {
        // code here
        int e=0;
        int o=0;
        int i;
        for(i=0;i<=N;i++)
        {
            if(i%2==0) //number is even
            {
                e = e+i;
            }
            else//number is odd..
            {
                o = o+i;
            }
        }
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(e);
        sum.add(o);
        return sum;
    }
}

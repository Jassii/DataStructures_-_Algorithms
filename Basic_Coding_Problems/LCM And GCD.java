// Given two numbers A and B. The task is to find out their LCM and GCD.

 

// Example 1:

// Input:
// A = 5 , B = 10
// Output:
// 10 5
// Explanation:
// LCM of 5 and 10 is 10, while
// thier GCD is 5.
// Example 1:

// Input:
// A = 14 , B = 8
// Output:
// 56 2
// Explanation:
// LCM of 14 and 8 is 56, while
// thier GCD is 2.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function lcmAndGcd() which takes an Integer N as input and returns a List of two Integers, the required LCM and GCD.

 

// Expected Time Complexity: O(log(min(A, B))
// Expected Auxiliary Space: O(1)

// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}// } Driver Code Ends


class Solution 
{
    static Long[] lcmAndGcd(Long A , Long B) 
    {
        // code here
        
        //calling function for gcd..
        long G = gcd(A,B);
        
        //calling function for lcm..
        long L = lcm(A,B);
        
        //this array will contain lcm and gcd..
        Long arr[] = new Long[2];
        arr[0] = L;
        arr[1] = G;
        
        return arr;
    }
    
    //function to find the LCM (using gcd method)
    static long lcm(Long A,Long B)
    {
        return (A/gcd(A,B))*B; //simple method to find the LCM..
    }
    
    //function to find the gcd of two numbers..
    static long gcd(Long A,Long B)
    {
        if(A==0)
        {
            return B;
        }
        if(B==0)
        {
            return A;
        }
        
        //base condition
        if(A==B)
        {
            return A;
        }
        
        //if A is greater than B..
        if(A>B)
        {
            return gcd(A-B,B);
        }
        return gcd(A,B-A);
    }
}

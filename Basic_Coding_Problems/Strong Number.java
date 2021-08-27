// Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, check if it is a Strong Number or not.
// Examples: 
 

// Input  : n = 145
// Output : Yes
// Sum of digit factorials = 1! + 4! + 5!
//                         = 1 + 24 + 120
//                         = 145

// Input :  n = 534
// Output : No

// Your Task:
// You don't need to read or print anything. Your task is to complete the function is_StrongNumber() which takes the number as input parameter and returns 1 if it is Strong Number otherwise returns 0.
 

// Expected Time Complexity : O(Number of digits in N)
// Expected Space Complexity: O(1)

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.is_StrongNumber(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int is_StrongNumber(int n)
    {
        // Code here
        int k=n;
        int sum=0;
        while(k>0)
        {
            int l = k%10;
            int f = fact(l);
            sum = sum + f;
            k=k/10;
        }
        
        if(sum==n)
        {
            return 1;
        }
        return 0;
    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}

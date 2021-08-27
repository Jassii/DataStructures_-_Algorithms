// Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

 

// Example 1:

// Input:
// N = 6
// Output:
// 1 
// Explanation:
// Factors of 6 are 1, 2, 3 and 6.
// Excluding 6 their sum is 6 which
// is equal to N itself. So, it's a
// Perfect Number.
// Example 2:

// Input:
// N = 10
// Output:
// 0
// Explanation:
// Factors of 6 are 1, 2, 5 and 10.
// Excluding 10 their sum is 8 which
// is not equal to N itself. So, it's
// not a Perfect Number.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function isPerfectNumber() which takes an Integer N as input and returns 1 if N is a Perfect number else returns 0.

 

// Expected Time Complexity: O(sqrt(N))
// Expected Auxiliary Space: O(1)

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    static int isPerfectNumber(Long N) 
    {
        // code here
        long i;
        long sum=1;
        for(i=2;i<=Math.sqrt(N);i++)
        {
            //finding the divisor
            if(N%i==0)
            {
                if(i!=Math.sqrt(N))  //condition..
                {
                    sum = sum+i+N/i;
                }
                else
                {
                    sum = sum+i;
                }
            }
        }
        
        //1 is not a perfect number(sum of factors excluding itself.)
        
        
        //if sum of divisor is equal to N..then it is a perfect number.
        if(sum==N && N!=1)
        {
            return 1;
        }
        return 0;
    }
}

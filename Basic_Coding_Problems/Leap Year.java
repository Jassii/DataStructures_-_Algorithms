// For an input year N, find whether the year is a leap or not. 
 

// Example 1:

// Input:
// N = 4
// Output:
// 1
// Explanation:
// 4 is not divisible by 100
// and is divisible by 4 so its
// a leap year
// Example 2:

// Input:
// N = 2021
// Output:
// 0
// Explanation:
// 2021 is not divisible by 100
// and is also not divisible by 4
// so its not a leap year

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function isLeap() which takes an integer N as input parameter and returns 1 is N is a leap year and 0 otherwise.
 

// Expected Time Complexity: O(1)
// Expected Space Complexity: O(1)
  
//   Following is pseudo-code 

// if year is divisible by 400 then is_leap_year
// else if year is divisible by 100 then not_leap_year
// else if year is divisible by 4 then is_leap_year
// else not_leap_year


// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isLeap(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int isLeap(int N)
    {
        //code here
        
        //first check if N is divisible by 400..
        if(N%400==0)
        {
            return 1;
        }
        //if N is divisible by 100..then it is not a leap year..
        else if(N%100==0)
        {
            return 0;
        }
        //but divisible by 4..then it is a leap year..
        else if(N%4==0)
        {
            return 1;
        }
        return 0;
    }
}

// Given a number in form of a string s. The task is to find whether the number is valid indian mobile number or not.
// Rules for valid :-indian mobile number

// The number should contain 10 or 11 or 12 digits.
// If it contains 10 digits, then first  digit should be 7 or 8 or 9.
// If it contains 11 digits, then first  digit should be 0 and second rule follwed.
// If it contains 12 digits, then first two digits should be 91 and second rule followed 
// Example 1:

// Input: s = "912345678999"
// Output: 1
// Example 2:

// Input: s = "123456789"
// Output: 0
 

// Your Task:
// You don't need to read or print anything. Your task is to complete the function is_valid() which takes s as input parameter and returns 1 if it is valid indian mobile number otherwise returns 0.
 

// Expected Time Complexity: O(1)
// Expected Space Complexity: O(1)

// { Driver Code Starts
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
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.is_valid(s);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int is_valid(String s)
    {
        // code here
        int len = s.length(); //length of the string.
        if(len==10 || len==11 || len==12)
        {
            if(len==10)
            {
                char first = s.charAt(0); //first character..
                if(first=='7' ||first=='8'|| first=='9')
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            else if(len==11)
            {
                char first = s.charAt(0); //first character..
                if(first=='0')
                {
                    char se = s.charAt(1); //second.
                    if(se=='7' ||se=='8'|| se=='9')
                    {
                        return  1;
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    return 0;
                }
            }
            else if(len==12)
            {
                String ft = s.substring(0,2); //first two character.
                if(ft.equals("91"))
                {
                    char t = s.charAt(0);
                    if(t=='7' ||t=='8'||t=='9')
                    {
                        return  1;
                    }
                    else
                    {
                        return 0;
                    }
                    
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                return 0;
            }
        }
            return 0;
    }
}

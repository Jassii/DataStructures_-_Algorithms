// A prime number is a natural number greater than 1, which is only divisible by 1 and itself. First few prime numbers are : 2 3 5 7 11 13 17 19 23 …..
//   A naive solution is to iterate through all numbers from 2 to sqrt(n) and for every number check if it divides n. If we find any number that divides, we return false.

import java.util.*;
import java.lang.*;
 
class GFG {
 
    // Check for number prime or not
    static boolean isPrime(int n)
    {
      //base condition..
        if(n==0 || n==1)
        {
            return false;
        }
      
        int i;
        for(i=2;i<=Math.sqrt(n);i++)   //this will take O(sqrt(n))..time complexity..
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        if (isPrime(14))
            System.out.println("true");
 
        else
            System.out.println("false");
    }
}

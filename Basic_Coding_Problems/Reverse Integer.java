// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
// Example 4:

// Input: x = 0
// Output: 0
 

// Constraints:

// -231 <= x <= 231 - 1

class Solution 
{
  //reverse function..
    public int reverse(int x) 
    {
        int lower = (int)Math.pow(-2,31); 
        int upper = (int)Math.pow(2,31)-1;
        
        
        //checking for positive or negative number..
        boolean sign=false;
        
        if(x<0)
        {
            sign=true;
            x = x*-1; 
        }
        
        long rev=0;  //storing the reverse of the number in a long data type..
        while(x>0)
        {
            int l = x%10; //last digit.
            rev = 10*rev+l;
            if(rev<lower || rev>upper)
            {
                return 0;
            }
            x = x/10;
        }
        
        //now rev will be storing the reverse number of x..
        if(sign==true)
        {
            rev = -1*rev;
        }
        
        return (int)rev==rev?(int)rev:0;  //now if we try to convert the long value into integer value..if both are same..then it is okay..otherwise return 0..not in range..
    }
}

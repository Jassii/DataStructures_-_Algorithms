// Java implementation of the above approach

import java.io.*;
class GFG {
 
    static int getSum(String str)
    {
        int sum = 0;
        int i;
        
        //traverse each character..convert it into integer.. and just take the sum..
        for(i=0;i<str.length();i++)
        {
            //why -48 because integer ascii value starts from 48..hence it will convert
            //the character into integer value..
            sum = sum + str.charAt(i)-48;
            
            //or another way..(character to string) then (string to integer)..
            sum = sum + Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        //suppose we are having a large number in the form of string..
        String st = "123456789123456789123422";
      
        System.out.print(getSum(st));
    }
}

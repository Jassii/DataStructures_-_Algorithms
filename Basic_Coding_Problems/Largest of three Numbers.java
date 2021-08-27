// Given three numbers x, y, and z of which aim is to get the largest among these three numbers.
//   Input: x = 7, y = 20, z = 56
// Output: 56   
//   Algorithm to find the largest of three numbers:

// 1. Start
// 2. Read the three numbers to be compared, as A, B and C
// 3. Check if A is greater than B.

//   3.1 If true, then check if A is greater than C
//          If true, print 'A' as the greatest number
//           If false, print 'C' as the greatest number

//   3.2 If false, then check if B is greater than C
//         If true, print 'B' as the greatest number
//         If false, print 'C' as the greatest number
// 4. End
// Approaches:

// Using Ternary operator


// Java Program to Find the Biggest of 3 Numbers
 
// Importing generic Classes/Files
import java.io.*;
 
class GFG {
   
    // Function to find the biggest of three numbers
    public static int biggestOfThree(int x,int y,int z)
    {
      
        //basic method using Math.max function..
        return Math.max(Math.max(a,b),c);  
        
        //trying to do with the ternary operator..
        return z>((x>y)?x:y)?z:((x>y)?x:y); 
    }
 
    // Main driver function
    public static void main(String[] args)
    {
 
        // Declaring variables for 3 numbers
        int a, b, c;
 
        // Variable holding the largest number
        int largest;
        a = 5;
        b = 10;
        c = 3;
        // Calling the above function in main
        largest = biggestOfThree(a, b, c);
 
        // Printing the largest number
        System.out.println(largest
                           + " is the largest number.");
    }
}

// how to calculate the Fibonacci of a number(recursion method....)
import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //It will return the sum of the fibonacci series till the number passed..
        System.out.println(fibonacci(n));  //print the total sum..
    }
    
    //Brute Force Approach..
    /*public static void fibonacci(int n)
    {
        int a=0;
        int b=1;
        int count=0;
        while(a<n)
        {
            System.out.print(a+" ");
            int sum = a+b;
            a = b;
            b = sum;
            
        }
    }*/
    
    //Using Recursion Method..
    public static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);  //recursion..
    }
}

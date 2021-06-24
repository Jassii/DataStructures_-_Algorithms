// how to calculate the factorial of a number(recursion..)
import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
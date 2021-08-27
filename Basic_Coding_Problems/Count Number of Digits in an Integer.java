// Count Number of Digits in an Integer
// Program to count number of digits in an integer is discussed here. 
//   An integer is given as input and the total number of digits in that integer is displayed as output. 
//   Finding the number of digits in an integer can be done using loops, recursion

import java.util.*;

public class Main
{
public static void main(String args[])
{
    
int n,count = 0;
System.out.print("\nEnter the number : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt(); //input the number..

  //one method..
//now i have to find the count of digits in the number..
String s = String.valueOf(n);
count = s.length();

  
  
//now other method is to count the digits.
while(n>0)
{
    count++;
    n=n/10;
}

  
  
//Using recursive approach..
count = Count(n);//calling method

System.out.println("Number of digits : " + count);
}
  
  //for recursion..
public static int Count(int n)
{
    if(n==0)
    {
        return 0;
    }
    return 1+Count(n/10);
}
}

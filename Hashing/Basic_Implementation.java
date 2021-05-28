import java.util.*;
class Main
{
    final static int MAX = 1000; 
    static boolean Hash[][] = new boolean[MAX+1][2];
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1,-9,-5,-8,-5,-2};
        int n = arr.length;  //size of the array..
        
        //insert each value in the array in the Hash..
        insert(arr,n);
        int X = sc.nextInt();  //value to be searched..
        
        if(search(X)==true)
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
        
    }
    public static boolean search(int X)
    {
        if(X>=0)//if the value to be searched is positive...
        {
            if(Hash[X][0]==true)  //if at that index..true is there or not?..
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else  //as here the value will be negative...
        {
            X = Math.abs(X);  //converting into positive number..
            if(Hash[X][1]==true)  //if at that index true is there..
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void insert(int arr[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=0)   //if the number to be inserted is positive..
            {
                Hash[arr[i]][0] = true;
            }
            else  //if the number to be inserted is negative..
            {
                Hash[Math.abs(arr[i])][1] = true;
            }
        }
    }
}

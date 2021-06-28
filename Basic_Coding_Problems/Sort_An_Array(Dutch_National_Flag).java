import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //sort an array of 0's,1's and 2's..
	    //one method.(use of insertion sort..)
		int arr[] = {0,1,1,0,2,2,1,0,2};
		/*int i;
		for(i=1;i<arr.length;i++)
		{
		    int key = arr[i];
		    int j = i-1;
		    while(j>=0 && key<arr[j])
		    {
		        arr[j+1] = arr[j];
		        j--;
		    }
		    arr[j+1] = key;
		}
		for(i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Another method to do this question..
		/*int i;
		int countz=0,counto=0,countt=0;
		for(i=0;i<arr.length;i++)
		{
		    if(arr[i]==0)
		    {
		        countz++;
		    }
		    else if(arr[i]==1)
		    {
		        counto++;
		    }
		    else
		    {
		        countt++;
		    }
		}
		System.out.println("Count 0 is "+countz+" Count 1 is "+counto+" Count 2 is "+countt);
		for(i=0;i<countz;i++)
		{
		    arr[i] = 0;
		}
		for(i=0;i<counto;i++)
		{
		    arr[i+countz] = 1;
		}
		for(i=0;i<countt;i++)
		{
		    arr[i+counto+countz] = 2;
		}
		for(i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //Another method..to do this question..
     /*int low=0;
     int high = arr.length-1;
     int mid = 0; //(low+high)/2;  //this will store the mid value..
     int i;
     for(i=0;i<arr.length;i++)
     {
        if(arr[i]==0)
        {
            low++;
            mid++;
        }
        else if(arr[i]==1)
        {
            mid++;
        }
        else
        {
            high--;
        }
     }
     System.out.println(low+" "+mid+" "+high);
     for(i=0;i<low;i++)
     {
         arr[i] = 0;
     }
     for(i=low;i<mid;i++)
     {
         arr[i] = 1;
     }
     for(i=high+1;i<arr.length;i++)
     {
         arr[i] = 2;
     }
    for(i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }*/
    
    ////////////////////////////////////////////////////////////////////////////////
    //Another meothod Efficient..
    int low=0;
    int mid=0;
    int high = arr.length-1;
    int i;
    while(mid<=high)
    {
        switch(arr[mid])
        {
            case 0:
                if(arr[mid]!=arr[low])
                {
                    int t = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = t;
                }
                low++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                if(arr[mid]!=arr[high])
                {
                    int t = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = t;
                }
                high--;
        }
    }
    for(i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}

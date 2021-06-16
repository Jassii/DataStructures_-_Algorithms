import java.util.*;

class ActivitySelection
{
    public void printMaxActivities(int s[],int f[],int n)
    {
        System.out.println("Activites selected are as follows : ");
        
        //the first activity always get selected..
        System.out.print(0+" ");
        
        int i,j=0;
        for(i=1;i<n;i++)
        {
            if(s[i]>=f[j])
            {
                System.out.print(i+" ");
                j=i;  //this has to be done..
            }
        }
    }
}
class Main
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   
	   //we are considering that the start time is already sorted by the finish time..
	   int s[] =  {1, 3, 0, 5, 8, 5};  //start time..
       int f[] =  {2, 4, 6, 7, 9, 9};  //finish time..
       ActivitySelection obj = new ActivitySelection(); //object of ActivitySelection class..
       int n = s.length;  //length of the start array..
       obj.printMaxActivities(s,f,n);
	}
}

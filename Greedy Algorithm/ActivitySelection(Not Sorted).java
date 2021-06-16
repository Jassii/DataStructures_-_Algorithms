import java.util.*;

class Activity
{
    int start,finish;
    public Activity(int start,int finish)
    {
        this.start = start;
        this.end = end;
    }
}

class Compare
{
    static void compare(Activity arr[],int n)
    {
        Arrays.sort(arr, new Comparator<Activity>()
        {
             @Override
             public int compare(Activity s1, Activity s2)
             {
               return s1.finish - s2.finish;
             }
        });
    }
}

class ActivitySelection
{
    public void printMaxActivities(Activity arr[],int n)
    {
        // Sort jobs according to finish time
       Compare obj = new Compare();
       obj.compare(arr, n);
        
        
        System.out.println("Activites selected are as follows : ");
        //the first activity always get selected..
        System.out.print(0+" ");
        
        int i=0,j;
        for(j=1;j<n;j++)
        {
            if(arr[j].start>=arr[i].finish)
            {
                System.out.print(i+" ");
                i=j;  //this has to be done..
            }
        }
    }
}
class Main
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   
	   int s[] = {75250, 50074, 43659, 8931, 11273,27545, 50879, 77924};
       int f[] = {112960, 114515, 81825, 93424, 54316,35533, 73383, 160252};
	   
       int n = s.length;  //length of the start array..
       
       //suppose the arrays are not sorted...
       Activity arr = new Activity[n];
       for(i=0;i<n;i++)
       {
           arr[i] = new Activity(s[i],f[i]);
       }
       
       ActivitySelection obj = new ActivitySelection(); //object of ActivitySelection class..
       obj.printMaxActivities(arr,n);
	}
}

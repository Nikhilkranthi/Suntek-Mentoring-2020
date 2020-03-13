package bitmanipulation;
public class MaxXOR 
{
    public static int FinDMaxXor(int [] arr)
    {
        int max=0;
        for(int index=0;index<arr.length;index++)
        {
            int temp=arr[index];
            for(int j=index+1;j<arr.length;j++)
            {
                temp=temp^arr[j];
                if(temp>max)
                {
                    max=temp;
                }
                temp=arr[index];
            }
        }
        return max;
    }
    public static void main(String [] args)
    {
        Testing();
        
    }
    public static void Testing()
    {
        //TestCase 1
        int [] test1arr=new int[]{3,10,5,25,2,8};
        int ans1=FinDMaxXor(test1arr);
        int exp1=28;
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        
        //TestCase 2
        int [] test2arr=new int[]{2,4,1,8,6,3};
        int ans2=FinDMaxXor(test2arr);
        int exp2=14;
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        
        //TestCase 3
        
    }
}

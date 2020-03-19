package recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class findMissing 
{   
    
    public static void main(String[] args)
    {
        Testing();
    }
    
    public static int findFrequency(int nums[],int target)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                c++;
            }
        }
        return c;
    }
    private static void Testing() 
    {
       //TestCase 1
        int [] test1arr=new int[]{-1,5,5,5,5,4,3,-1,-1};
        int ans1=findFrequency(test1arr,-1);
       
        int exp1=3;
    //    System.out.println(ans1);
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase 2
        int [] test2arr=new int[]{0,0,0,1,1,1,3,4,5};
        int ans2=findFrequency(test2arr,1);
       
        int exp2=3;
     //   System.out.println(ans2);
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase 3
        int [] test3arr=new int[]{0,1,2,3,3,3};
        int ans3=findFrequency(test3arr,3);
       // System.out.println(ans3);
        int exp3=3;
        //System.out.println(ans3);
        if(ans3==exp3)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
//         //TestCase 4
        int [] test4arr=new int[]{-1,5,5,5,5,4,3,-1,-1};
        int ans4=findFrequency(test4arr,-1);
       
        int exp4=3;
       // System.out.println(ans4);
        if(ans4==exp4)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase 5
        int [] test5arr=new int[]{5,5,5,5,5,5,5,5,5};
        int ans5=findFrequency(test5arr,5);
       
        int exp5=9;
    //    System.out.println(ans5);
        if(ans5==exp5)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        
    }
    
}

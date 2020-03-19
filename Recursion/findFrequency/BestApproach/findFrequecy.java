
package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class findFrequency 
{   
    static List<Integer> sol=new ArrayList<Integer>();
    public static void main(String[] args)
    {
        Testing();
    }
    public static int searchRange(int[] nums, int target) 
    {
        int start=0;int end=nums.length-1;
    int [] nums1=new int[2];
        Arrays.sort(nums);
        binarySearch(nums,start,end,target);
        
       int max=sol.get(0),min=sol.get(0);
        
        for(int i=0;i<sol.size();i++)
        {
            if(sol.get(i)>max)
            {
                max=sol.get(i);
            }
           else if(sol.get(i)<min)
            {
                min=sol.get(i);
            }
        }
         
        nums1[0]=min;
         nums1[1]=max;
        // return nums1;
       //System.out.println(nums1[1]);
       sol.removeAll(sol);
        return nums1[1]-nums1[0]+1;
        
    }
 
    public static void binarySearch(int [] nums,int start,int end,int target)
    {
        if(start>end)
        {
            return;
        }
        int mid=(start+end)/2;
        if(nums[mid]==target)
        {
              int L=mid;
           sol.add(L);
              binarySearch(nums,start,mid-1,target);
            // sol.add(L);
             int R=mid;
             sol.add(R);
             binarySearch(nums,mid+1,end,target);
            
            
         //   System.out.println(R);
        }
        
        else
        {
            if(nums[mid]>target)
            {
                end=mid-1;
                binarySearch(nums,start,end,target);
            }
            if(nums[mid]<target)
            {
                start=mid+1;
                binarySearch(nums,start,end,target);
            }
            if(start==end)
            {
               
                return;
            }
        }
     
    }

    private static void Testing() 
    {
//       //TestCase 1
        int [] test1arr=new int[]{-1,5,5,5,5,4,3,-1,-1};
        int ans1=searchRange(test1arr,-1);
       
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
        int ans2=searchRange(test2arr,1);
       
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
//         //TestCase 3
        int [] test3arr=new int[]{0,1,2,3,3,3};
        int ans3=searchRange(test3arr,3);
       
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
        int ans4=searchRange(test4arr,-1);
       
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
        int ans5=searchRange(test5arr,5);
       
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

package recursion;

import java.util.ArrayList;
import java.util.List;

public class findMedian 
{
    public static void main(String [] args)
    {
        Testing();
    }

    private static void Testing() 
    {
        //TestCase 1
        int [] test1arr1=new int[]{3,4,5,7,8,9};
        int [] test1arr2=new int[]{10,11,12,13,14,15};
        double ans1=findMedianSortedArrays(test1arr1,test1arr2);
     //   System.out.println(ans1);
        double exp1=19/2.0;
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 2
        int [] test2arr1=new int[]{1000,1001,1002};
        int [] test2arr2=new int[]{10000,10001,10002};
        double ans2=findMedianSortedArrays(test2arr1,test2arr2);
     //   System.out.println(ans1);
        double exp2=11002/2.0;
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
          //TestCase 3
        int [] test3arr1=new int[]{1,3,5,7};
        int [] test3arr2=new int[]{0,2,4,6};
        double ans3=findMedianSortedArrays(test3arr1,test3arr2);
      //  System.out.println(ans3);
        double exp3=3.5;
        if(ans3==exp3)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
            //TestCase 4
        int [] test4arr1=new int[]{102,105,1000,1005,2000};
        int [] test4arr2=new int[]{9,15,26,83,1000};
        double ans4=findMedianSortedArrays(test4arr1,test4arr2);
      //  System.out.println(ans3);
        double exp4=103.5;
        if(ans4==exp4)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double median=0;
           // Sort both the arrays
            int index1=0;
            int index2=0;
            List<Integer> l=new ArrayList<Integer>();
            while((index1+index2)<(nums1.length)+nums2.length)
            {
                if(index1==nums1.length)
                {
                    l.add(nums2[index2++]);
                }
                else if(index2==nums2.length)
                {
                    l.add(nums1[index1++]);
                }
                else 
                {
                    if(nums1[index1]>=nums2[index2])
                    {
                        l.add(nums2[index2++]);
                    }
                    else
                    {
                        l.add(nums1[index1++]);
                    }
                }
            }

            //Print the median
                median=(l.get((l.size()/2)-1)+l.get(l.size()/2))/2.0;
              //  System.out.println("Hi");
                return median;
            
            
        
      
    }
}

package bitmanipulation;
import java.util.Arrays;
import java.util.Scanner;

public class BitManipulation1
{
     public  static int [] manipulate(int[] arr, int[] queries) 
    {
        int c=0;
        int [] ans=new int[queries.length/2];
        for(int i=0;i<queries.length;i+=2)
        {
            int temp=0;
            for(int k=queries[i];k<=queries[i+1];k++)
            {
               temp=temp^arr[k];
            }
             ans[c++]=temp;
        }
        return ans;
    }

    public static void main(String[] args) throws Exception
    {
        Scanner InputReader=new Scanner(System.in);           
        int sizeOfArray=InputReader.nextInt();
        int [] arr=new int[sizeOfArray];
        
        // Input Array 
        
        for(int i=0;i<sizeOfArray;i++)
        {
            arr[i]=InputReader.nextInt();
        }
        
        // Input queries
        
        int NoOfQueries=InputReader.nextInt();
        int [] queries=new int[2*NoOfQueries];
        for(int i=0;i<2*NoOfQueries;i+=2)
        {
            queries[i]=InputReader.nextInt();
            queries[i+1]=InputReader.nextInt();;
        }
        
        // Calling the implementaion
        
        int[] ans = manipulate(arr,queries);
        
        // Printing the output
        
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        Testing();
    }
    
    //Testing
    
    public static void Testing()
    {
        //TestCase 1
        int [] testArray1=new int[]{1,3,4,8};
        int [] testQuery1=new int[]{0,1,1,2,0,3,3,3};
        int [] test1ans=manipulate(testArray1,testQuery1);
        int [] exp1=new int[] {2,7,14,8};
        if(Arrays.equals(test1ans, exp1))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // TestCase 2
        int [] testArray2=new int[]{1,8,0,1,3,4};
        int [] testQuery2=new int[]{0,0,0,4,1,4,4,4,4,5};
        int [] test2ans=manipulate(testArray2,testQuery2);
        int [] exp2=new int[] {1,11,10,3,7};
        if(Arrays.equals(test2ans, exp2))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // TestCase 3
        int [] testArray3=new int[]{0,0,0,0,0,0,0};
        int [] testQuery3=new int[]{0,3,0,2,0,5,1,5};
        int [] test3ans=manipulate(testArray3,testQuery3);
        int [] exp3=new int[] {0,0,0,0};
        if(Arrays.equals(test3ans, exp3))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // TestCase 2
        int [] testArray4=new int[]{1,1,1,1,1};
        int [] testQuery4=new int[]{0,3,0,2,0,4,1,2};
        int [] test4ans=manipulate(testArray4,testQuery4);
        int [] exp4=new int[] {0,1,1,0};
        if(Arrays.equals(test4ans, exp4))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        // TestCase 2
        int [] testArray5=new int[]{100,0,200,45};
        int [] testQuery5=new int[]{0,3,1,3,3,3,2,3,1,2};
        int [] test5ans=manipulate(testArray5,testQuery5);
        int [] exp5=new int[] {129,229,45,229,200};
        if(Arrays.equals(test5ans, exp5))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        
        
    }
   
   

    
    

}

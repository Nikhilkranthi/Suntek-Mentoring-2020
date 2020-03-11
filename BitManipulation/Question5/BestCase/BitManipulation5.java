package bitmanipulation;


import java.util.Arrays;

public class BitManipulation5 
{
    public static int [] NoOfSetBits(int number)
    {
        int [] output=new int [number+1];
        
        output[0]=0;
        for(int i=1;i<=number;i++)
        {
            output[i]=output[(i)&(i-1)]+1;
        }
        return output;
    }
    public static void main(String [] args)
    {
        testing();
    }

   public static void testing() 
    {
        //Testcase 1
        int test1=2;
      int [] ans1=NoOfSetBits(test1);
      int [] exp1=new int[]{0,1,1};
      if(Arrays.equals(ans1,exp1))
      {
          System.out.println("Passed");
      }
      else
      {
          System.out.println("Failed");
      }
       //Testcase 2
        int test2=4;
      int [] ans2=NoOfSetBits(test2);
      int [] exp2=new int[]{0,1,1,2,1};
      if(Arrays.equals(ans2,exp2))
      {
          System.out.println("Passed");
      }
      else
      {
          System.out.println("Failed");
      }
    
    //Testcase 3
      int test3=10;
      int [] ans3=NoOfSetBits(test3);
      int [] exp3=new int[]{0,1,1,2,1,2,2,3,1,2,2};
      if(Arrays.equals(ans3,exp3))
      {
          System.out.println("Passed");
      }
      else
      {
          System.out.println("Failed");
      }
      
      //Testcase 4
     
      int test4=8;
      int [] ans4=NoOfSetBits(test4);
      int [] exp4=new int[]{0,1,1,2,1,2,2,3,1};
      if(Arrays.equals(ans4,exp4))
      {
          System.out.println("Passed");
      }
      else
      {
          System.out.println("Failed");
      }
      
      // TestCase 5
      int test5=18;
      int [] ans5=NoOfSetBits(test5);
      int [] exp5=new int[]{0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2};
      if(Arrays.equals(ans5,exp5))
      {
          System.out.println("Passed");
      }
      else
      {
          System.out.println("Failed");
      }
     
      
    }
}

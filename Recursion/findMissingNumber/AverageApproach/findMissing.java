
package recursion;

public class findMin 
{
          public static void main(String [] args)
          {
        Testing();
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int [] input=new int [n];
//        for(int i=0;i<n;i++)
//        {
//            input[i]=s.nextInt();
//        }
//        int answer=findMissing(input);
//        System.out.println(answer);
           }
          public static int findMissing(int [] input)
          {
              int min=input[0];
              int max=input[0];
              for(int i=0;i<input.length;i++)
              {
                  if(input[i]<min)
                  {
                      min=input[i];
                  }
                  else if(input[i]>max)
                  {
                      max=input[i];
                  }
                  
              }
              int sumOfArrayExpected=0;
              for(int i=0;i<input.length;i++)
              sumOfArrayExpected=sumOfArrayExpected+min++;
             // System.out.println(sumOfArrayExpected);
              int sumOfArray=0;
              for(int index=0;index<input.length;index++)
              {
                  sumOfArray=sumOfArray+input[index];
              }
              int missingNumber=sumOfArrayExpected-sumOfArray+max;
              return missingNumber;
          }
    private static void Testing() 
    {
       //TestCase 1
        int [] test1arr=new int[]{3,4,5,7,8,9};
        int ans1=findMissing(test1arr);
     //   System.out.println(ans1);
        int exp1=6;
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 2
        int [] test2arr=new int[]{1000,1002,1003,1004,1005};
        int ans2=findMissing(test2arr);
      // System.out.println(ans2);
        int exp2=1001;
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 3
        int [] test3arr=new int[]{99,100,101,102,104};
        int ans3=findMissing(test3arr);
       
        int exp3=103;
        if(ans3==exp3)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 4
        int [] test4arr=new int[]{199,200,201,203,204};
        int ans4=findMissing(test4arr);
       
        int exp4=202;
        if(ans4==exp4)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase 5
        int [] test5arr=new int[]{1499,1500,1501,1503,1504};
        int ans5=findMissing(test5arr);
       
        int exp5=1502;
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

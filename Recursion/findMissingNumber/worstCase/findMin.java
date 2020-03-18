/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
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
                    if(input[0]!=1)
                              return 1;
              Arrays.sort(input);
              int min=input[0];
              for(int i=0;i<input.length;i++)
              {
                  if(input[i]==min)
                  {
                      min++;
                  }
                  else
                  {
                      break;
                  }
              }
              return min;
          }
    private static void Testing() 
    {
       //TestCase 1
        int [] test1arr=new int[]{1,2,3,5,6,7};
        int ans1=findMissing(test1arr);
       
        int exp1=4;
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 2
        int [] test2arr=new int[]{1,3,4,5,6};
        int ans2=findMissing(test2arr);
       
        int exp2=2;
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 3
        int [] test3arr=new int[]{2,3,4,5,6};
        int ans3=findMissing(test3arr);
      // System.out.println(ans3);
        int exp3=1;
        if(ans3==exp3)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase 4
        int [] test4arr=new int[]{1,2,3,5,6,7,8};
        int ans4=findMissing(test4arr);
       
        int exp4=4;
        if(ans4==exp4)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase 5
        int [] test5arr=new int[]{1,2,3,4,9};
        int ans5=findMissing(test5arr);
       
        int exp5=5;
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

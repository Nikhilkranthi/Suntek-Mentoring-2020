package bitmanipulation;
public class MinReplacements
{
    static int c=0;
    public static int findMinReplacements(int n)
    {
        // Using a loop and bitManipulation
        int c=0;
        while(n!=1)
        {
            if((n&1)==0)
            {
                n=n>>1;
                c++;
            }
            else
            {
                n=(n)&(n-1);
                c++;
            }
        }
        return c;
      
      
    }
    public static void main(String [] args)
    {
    Testing();
    }

    public static void Testing() 
    {
        //TestCase1
        int test1=8;
        int ans1=findMinReplacements(test1);
        int exp1=3;
        System.out.println(ans1);
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase2
        int test2=9;
        int ans2=findMinReplacements(test2);
        int exp2=4;
         System.out.println(ans2);
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase3
        int test3=13;
        int ans3=findMinReplacements(test3);
        int exp3=5;
        if(ans3==exp3)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase4
        int test4=21;
        int ans4=findMinReplacements(test4);
        int exp4=6;
        if(ans4==exp4)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase5
        int test5=101;
        int ans5=findMinReplacements(test5);
        int exp5=9;
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

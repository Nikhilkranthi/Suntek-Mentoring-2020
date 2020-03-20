package alltestfree;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class printValidPerantheis {
    static List<String> str=new ArrayList<String>(100);
    
     static int x=0;
    static int y=0;
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int actual=n;
        y=power(2,n)-1;
        printPerantheis(n,actual);
        isValid(str);
       // System.out.println(c);
    }

    private static void printPerantheis(int n,int actual) 
    {
       if(n==0)
       {

           return;
           
       }
       int iterations=actual-n;
       int iterations1=power(2,(iterations));
       for(int j=0;j<iterations1;j++)
       {
       printB(n,"(");
       printB(n,")");
       }
      // System.out.println();
       n--;
       printPerantheis(n,actual) ;
               
    }
    
    private static void printB(int n, String i) 
    {
      
          for(int in=0;in<Math.pow(2,n-1);in++)
          {
              try
              {
              str.set(x,str.get(x)+i);
              }
              catch(IndexOutOfBoundsException e)
              {
                  str.add(x,i);
              }
              x++;
              if(x>y)
              {
                  x=0;
              }
          }
      
    }

    private static int power(int i, int i0) {
        int ans=1;
        for(int x1=0;x1<i0;x1++)
        {
            ans=ans*i;
        }
        return ans;
    }

    private static int isValid(List<String> str) {
        int c=0;
        for(int i=0;i<str.size();i++)
        {
            if(isVal(str.get(i)))
                System.out.println(str.get(i));
        }
        return c;
    }

    private static boolean isVal(String str) 
    {
       Stack<Character> charStack = new Stack<>();
       
       for(int index=0;index<str.length();index++)
       {
           if(str.charAt(index)=='(')
           {
               charStack.push(str.charAt(index));
           }
           if(str.charAt(index)==')')
           {
               try
               {
                 if(charStack.peek()=='(')
                 {
                  charStack.pop();
                  }
               else
               {
                   charStack.push(str.charAt(index));
               }  
               }
               catch(EmptyStackException e)
               {
                   return false;
               }
               
           }
       }
       if(charStack.isEmpty())
       {
          return true;
       }
       else
       {
           return false;
       }
    }
    
}

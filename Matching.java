import java.lang.*;
import java.io.*;
import java.util.*;


class Matching
{
    static void isMatch(String str)
    {
        if (str=="")
        return;
        int len = str.length();
        
        ArrayList<Character> st = new ArrayList<Character>();

         char arr[] = str.toCharArray();
         int i,j;
         for (i=0;i<len;i++)
         {
             if( arr[i]=='{' || arr[i]=='[' || arr[i]=='(' )
             {
                 st.add(arr[i]);
                 break;
             }
             for(j=i;j<len;j++)
             {
                if( arr[j]=='}' || arr[j]==']' || arr[j]==')' )
                {
                    st.remove(j);
                    st.remove(i);
                    break;

                }
   
             }
             
         }

         System.out.println(st);


         




    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();



       




    }
}
//all permutations of a string
import java.util.*;
import java.lang.*;
class test
{
    static void generate( String str, String res)
    {
        if (str.length()==0)
        System.out.println(res + " ");

        int i;
        for (i=0;i<str.length();i++)
        {
            char c = str.charAt(i);

            String t = str.substring(0, i) + str.substring(i+1);
            
            generate(t, res + c);
        }

        
    }
        
    public static void main(String[] args) {
        String s = "abc";
        generate(s, " ");
        
    }
}
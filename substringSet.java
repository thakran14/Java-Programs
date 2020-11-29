//Generating distinct subsequences of a given string in lexicographic order
import java.util.*;
import java.lang.*;
class substringSet
{

    static void generate (Set<String> s , String str)
    {
        if(str.length()==0)
        return;

        if(!s.contains(str))
            s.add(str);

        for(int i=0;i<str.length();i++)
        {
            String t=str;
            t = t.substring(0,i) + t.substring(i+1);
            generate(s,t);  
        }

    }
    public static void main(String[] args)
    {
        String str = "abc";
        TreeSet<String> ts = new TreeSet<>();
        generate(ts , str);
        for(String i:ts)
        System.out.println(i);
    }
}
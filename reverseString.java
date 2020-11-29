import java.util.*;
import java.io.*;

class reverseString
{
    public static void main(String[] args)
    {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the string to be reversed ");
            String str =  s.nextLine();
            char[] arr = str.toCharArray();
            List<Character> tr = new ArrayList<>();
            for(char c : arr)
            tr.add(c);
            Collections.reverse(tr);
            for(char c : tr)
            System.out.print(c);
            System.out.println();

            //another method

            StringBuilder sb = new StringBuilder();
            sb.append(str);
             sb = sb.reverse();
            System.out.print(sb);

    }
}
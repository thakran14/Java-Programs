import java.util.*;
import java.lang.*;
import java.io.*;

class reverseStack
{
    static Stack<Character> st = new Stack<Character>();

    static void insert_bottom(char x)
    {
        if(st.empty())
        st.push(x);

        else
        {
            char a = st.peek();
            st.pop();
            insert_bottom(x);

            st.push(a);
        }

    }

    static void reverse()
    {
        if(st.size()>0)
        {
            char x = st.peek();
            st.pop();
            reverse();

            insert_bottom(x);
        }

        
        
    }
    public static void main (String[] args)
    {


        st.push('1');
        st.push('2');
        st.push('3');
        System.out.println(st);
        reverse();

        System.out.println(st);

    }
}
import java.util.*;

class test2
{
    static Stack<Integer> st = new Stack<>();
    

    static void insert_bottom(int ele)
    {
        if(st.isEmpty())
        st.push(ele);

        else
        {
            int a =  st.peek();
            st.pop();

            insert_bottom(ele);

            st.push(a);
        }
           


            
        

    }

    static void reverse()
    {
        if(!st.isEmpty())
        {
            int ele = st.peek();
            st.pop();
            reverse();

            insert_bottom(ele);
        }
        

    }

    public static void main(String[] args)
    {
        st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
        reverse();
        
    System.out.println(st);



    }
}
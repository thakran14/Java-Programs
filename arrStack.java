import java.util.*;
import java.io.*;
import java.lang.*;


class arrStack
{
    int max = 100;
    int arr[] = new int[max];
    int top;

    arrStack()
    {
        top = -1;
    }

    void push (int ele)
    {
        if(top == arr.length)
        System.out.println("Stack full");
        else
        arr[++top] = ele;
    }

    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
            return -1;
        
        }
        else
        return arr[top--];

    }


    public static void main (String[] args)
    {
        arrStack obj = new arrStack();
        obj.push(5);
        obj.push(10);
        obj.pop();
        obj.pop();
        obj.pop();
    }
}
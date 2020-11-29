import java.util.*;
import java.lang.*;

class deleteEle
{
    static int deleted(int[] arr, int n, int x)
    {
        if (arr[n-1] == x)
        return (n-1);

        int i;
        for (i=0;i<n;i++)
            if (arr[i]==x)
                break;

         n=n-1;

        for(int j=i;j<n;j++)
        {
            arr[j] = arr[j+1];

        }

        return n;

    }

    static int deletion(int arr[] ,int n, int x)
    {

        int prev = arr[n-1];
        int i;

        if(prev == x)
        return n-1;

        for (i=n-2; arr[i]!=x && i>=0 ;i--)
        {
            int temp = arr[i];
            arr[i] =  prev;
            prev= temp;
        }

        if(i<0)
        return 0 ;

        arr[i] = prev;

        return (n-1);


    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int n = arr.length;
        int x = 2;
        n = deleted(arr, n, x);
        

        for(int j=0;j<n;j++)

        System.out.println(arr[j] + " ");
        
        
        
    }
}

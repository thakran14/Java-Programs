import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static boolean isPal(String str)
    {
        int i=0;
        if(str.length() >100)
        {
        System.out.println("Too big string");
        return false;
    }
        int j= str.length()-1;
        while(i<j)
        {
            if (str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T>0)
		{
		    String str = s.nextLine();
		    boolean flag= isPal(str);
		if (flag)
		System.out.println("Yes");
		else
		System.out.println("No");
		T--;
		}
		
		
		
	}
}
// arraylist program
import java.util.*;
import java.io.*;

public class arraylist
{
    public static void main(String[] args)
    {
    ArrayList<String> al = new ArrayList<String>();
    al.add("hello");
    al.add("this");
    al.add("is");
    al.add("printed");
    al.add("not this ");
    System.out.println(al);
    al.remove(4);
    System.out.println(al);
    al.set(3,"oh yes");
    al.get(0);
    al.clear();
    System.out.println(al);
    al.size();

     al.add("this");
    al.add("is");
    al.add("new");
    al.add("sentence");
    al.add("printed");

    Collections.sort(al);
    for(String i: al)
    System.out.println(i);
    
    }
    

}
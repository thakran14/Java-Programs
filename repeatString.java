import java.util.*;
public class repeatString
{
void printRepeat(int arr[],int size)
{
int i,j;
for (i=0;i<size;i++)
for (j=i+1;j<size;j++)
{
if (arr[i]==arr[j])
System.out.println("The repeated digits are:" + arr[i] + " ");
}
}


public static void main(String[] args)
{
repeatString r = new repeatString();
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of the array:");
int length = s.nextInt();
int [] myArray = new int[length];
System.out.println("Enter the elements of the array:");

for(int i=0; i<length; i++ ) {
   myArray[i] = s.nextInt();
}
r.printRepeat(myArray,length);
}
 }
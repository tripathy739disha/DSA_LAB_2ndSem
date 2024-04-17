import java.util.*;
class ArrayMaxMin
  {
    public static void main(String args[])
    {
      Scaner sc=new Scanner(System.in);
      System.out.println("Enter number of elements in array ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements in array ");
      for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();
      int max=arr[0],min=arr[0];
      for(int i=0;i<n;i++)
        {
       if(arr[i]>max) max=arr[i];
       if(arr[i]<min) min=arr[i];
        }
    }
  }
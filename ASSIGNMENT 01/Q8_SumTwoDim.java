import java.util.*;
class SumTwoDim
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of Row and Columns of 2D-Array: ");
    int n=sc.nextInt();
    int m=sc.nextInt();

     int arr[][]=new int[n][m];
     System.out.println("Enter "+(m*n)+" elements");

    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        arr[i][j]=sc.nextInt();

    int s=0;
    for(int i=0;i<n;i++)
      {
      for(int j=0;j<m;j++)
        {
        System.out.print(arr[i][j]+" ");
          s+=arr[i][j];
        }
      System.out.println();
      }

    System.out.println("Sum of elements = "+s);
    
  }
}
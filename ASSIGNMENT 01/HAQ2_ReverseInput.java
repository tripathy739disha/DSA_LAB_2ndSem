import java.util.*;
class HAQ2_ReverseInput
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of lines :");
      int n=sc.nextInt();
      
      // Consume the remaining newline character
      sc.nextLine();

      String[] str=new String[n];
      System.out.println("Enter "+n+" lines of input ");
      for(int i=0;i<n;i++)
        {
          str[i]=sc.nextLine();
        }
      System.out.println("The reverse of the input is :");
      for(int i=n-1;i>=0;i--)
        {
          System.out.println(str[i]);
        }
    }
  }
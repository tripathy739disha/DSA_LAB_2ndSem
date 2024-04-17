import java.util.Scanner;
public class SimpleExceptionTest{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a : ");
    int a=sc.nextInt();
    System.out.println("Enter the value of b : ");
    int b=sc.nextInt();
    int arr[]={2,4,6,1};
    try{
      //If b=0 then it will throw ArithmeticException
      System.out.println("c = " + (a/b));
    }
    catch(ArithmeticException ae)
      {
        System.out.println("Exception caught : " +ae.getMessage());
      }
      try{
         System.out.println(arr[7]); //This statement generate ArrayIndexOutOfBoundsException
      }
    catch(ArrayIndexOutOfBoundsException aiob)
      {
        System.out.println("Exception caught : " +aiob);
      }
    
    System.out.println("Program Complete");
  }
}
//one Try may have multiple catch/final
//But catch without try not possible
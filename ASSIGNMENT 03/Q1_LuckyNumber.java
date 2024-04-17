import java.util.*;

/* class NumberFormatException extends Exception{
  NumberFormatException(String msg){
    super(msg);
  }
} */

public class Q1_LuckyNumber{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Lucky number : ");
    int n=sc.nextInt();

    try{
      if(n<0){
        throw new NumberFormatException("Negative number");
      }
      System.out.println("Your Lucky number is : "+n);
    }
    catch(NumberFormatException nfe){
      System.out.println(nfe);
    }
    
  }
}
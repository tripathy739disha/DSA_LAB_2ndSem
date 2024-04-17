import java.util.*;
class MarkOutOfBoundsException extends Exception{
  MarkOutOfBoundsException(String msg){
    super(msg);
  }
}

public class UDFExceptionTest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the mark : ");
    int mark=sc.nextInt();
    try{
      if(mark>100){
        throw new MarkOutOfBoundsException("Mark should not be greater than 100");
      }
    }
    catch(MarkOutOfBoundsException mob){
      System.out.println(mob.getMessage());
    }
  }
}
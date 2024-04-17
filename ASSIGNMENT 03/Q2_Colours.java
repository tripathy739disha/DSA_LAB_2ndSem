import java.util.*;
public class Q2_Colours{
  public static void main(String[] args){
    String colours[]=new String[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter four colours ");
    for(int i=0;i<4;i++)
      colours[i]=sc.nextLine();


    System.out.println("Convert String to Integer ");
    try{
        System.out.println(Integer.parseInt(colours[0]));
    }
    catch(NumberFormatException nfe){
      System.out.println("Exception caught : "+nfe);
    }

    System.out.println("Enter one more colour");
    try {
      colours[5]=sc.nextLine();
    }
    catch(ArrayIndexOutOfBoundsException aiob){
      System.out.println(aiob);
    }
    System.out.println("The colours entered are : ");
    for(int i=0;i<4;i++)
      System.out.println(colours[i]);

  }
}
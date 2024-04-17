//import java.util.*;
public class Divide2Repeatedly
{
  public static void main(String[] args) 
  {
    //Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(args[0]);
    System.out.println("The positive integer greater than 2 from command line argument is "+n);
    System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is ");
    int c=0;
    while(n/2>=2)
    {
      n/=2;
      c++;		
    }
    System.out.println(c);
  }

}

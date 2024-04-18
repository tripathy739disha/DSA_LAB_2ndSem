package Package1;
import java.util.Scanner;
class Student{
  String name;
  int roll;
  void inputDetails()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name of the student : ");
    name=sc.next();
    System.out.println("Enter the roll number of the student : ");
    roll=sc.nextInt();
  }
  void showDetails(){
    System.out.println("Name : "+name);
    System.out.println("Roll : "+roll);
  }
}

public class Test extends Student{
  public int mark1,mark2;
  public void inputDetails(){
    super.inputDetails();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of the student : "); 
    mark1 = sc.nextInt();
    System.out  .println("Enter the marks of the student : ");
    mark2 = sc.nextInt();
  }
  public void showDetails(){
    super.showDetails();
    System.out.println("Marks : "+mark1);
    System.out.println("Marks : "+mark2);
  }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////

package Pack2;
import Package1.*;

interface Sports{
   int score1=89,score2=99;
}
public class Result extends Test implements Sports{
  public static void main(String args[]){
    Test t1 = new Test();
    t1.inputDetails();
    t1.showDetails();

    int grandTotal = t1.mark1+t1.mark2+score1+score2;
    System.out.println("Grand Total : "+grandTotal);
  }
}



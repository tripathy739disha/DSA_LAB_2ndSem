import java.util.*;
class Student
  {
    int Roll;
    String Name;
    int DSA_Mark;
    void getdata(int r,String n,int d)
    {
      Roll=r;
      Name=n;
      DSA_Mark=d;
    }
    void showdata()
    {
      System.out.println("Roll: "+Roll);
      System.out.println("Name: "+Name);
      System.out.println("DSA Mark: "+DSA_Mark);
    }
    public static void main(String[] args)
    {
      Student[] stud=new Student[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          System.out.println("Enter Roll,Name,DSA Mark of student "+(i+1));
          int r=sc.nextInt();
          String n=sc.next();
          int d=sc.nextInt();
          stud[i]=new Student();
          stud[i].getdata(r,n,d);
        }

      Student max=stud[0];
      for(int i=0;i<5;i++)
        if(stud[i].DSA_Mark>max.DSA_Mark) max=stud[i];

      System.out.println("Student with highest DSA Mark");
      max.showdata();
    }
  }
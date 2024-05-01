import java.util.Scanner;
class Q10_SumColumn{
  public static void main(String[] args){
    double[][] arr=new double[3][4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a 3-by-4 matrix row by row");
    for(int i=0;i<3;i++)
      for(int j=0;j<4;j++)
        arr[i][j]=sc.nextDouble();

     for(int i=0;i<4;i++)
       System.out.println("Sum of the elements at column "+i+" is "+sumColumn(arr,i));
  }

  public static double sumColumn(double[][] m,int columnIndex)
  {
    double sum=0;
    for(int i=0;i<m.length;i++)
      //m.length gives no. of rows 
      sum+=m[i][columnIndex];
    //here for each column i changes but j is constant
    return sum;
  }
}


/**********     OUTPUT      **********
 ~/DSA-LAB-ASSIGNMENTS/ASSIGNMENT 01$ javac Q10_SumColumn.java
  ~/DSA-LAB-ASSIGNMENTS/ASSIGNMENT 01$ java Q10_SumColumn
  
  Enter a 3-by-4 matrix row by row
  1.5 2 3 4
  5.5 6 7 8
  9.5 1 3 1
  Sum of the elements at column 0 is 16.5
  Sum of the elements at column 1 is 9.0
  Sum of the elements at column 2 is 13.0
  Sum of the elements at column 3 is 13.0
  **********/
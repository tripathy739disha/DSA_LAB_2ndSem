import java.util.*;
class product
  {
    int pid;
    int price;
    static int tot_price;
    product()
    {
      pid=0;
      price=0;
    }
    void display()
    {
      System.out.println("Product ID: "+pid);
      System.out.println("Product Price: "+price);
    }
    
  }
class Run
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      product p[]=new product[5];
      for(int i=0;i<5;i++)
        {
          p[i]=new product();
          System.out.println("Enter Product ID and Price of product "+(i+1));
          p[i].pid=sc.nextInt();
          p[i].price=sc.nextInt();
          product.tot_price+=p[i].price;
        }
      System.out.println("Total Price: "+product.tot_price);
    }
  }
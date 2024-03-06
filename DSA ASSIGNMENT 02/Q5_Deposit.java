class Deposit
  {
    long Principal;;
    int Time;
    double rate;
    double Total_amt;
    Deposit()
    {
      Principal=0;
      Time=0;
      rate=0;
      Total_amt=0;
    }
    Deposit(long p,int t,double r)
    {
      Principal=p;
      Time=t;
      rate=r;
    }
    Deposit(long p,int t)
    {
      Principal=p;
      Time=t;
      rate=0.08;
    }
    Deposit(long p,double r)
    {
      Principal=p;
      Time=1;
      rate=r;
    }
    void display()
    {
      System.out.println("Principal: "+Principal);
      System.out.println("Time: "+Time);
      System.out.println("Rate: "+rate);
      System.out.println("Total Amount: "+Total_amt);
    }
    void calc_amt()
    {
      Total_amt=Principal+(Principal*Time*rate)/100;
    }
  }
class Run
  {
    public static void main(String[] args)
    {
      Deposit d1=new Deposit(1000,2,9.5);
      d1.calc_amt();
      d1.display();
      Deposit d2=new Deposit(1000,2);
      d2.calc_amt();
      d2.display();
      Deposit d3=new Deposit(1000,9.5);
      d3.calc_amt();
      d3.display();
    }
  }
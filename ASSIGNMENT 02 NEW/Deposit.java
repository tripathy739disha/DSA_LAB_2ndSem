import java.util.*;
public class Deposit 
{
    long principal;
    int time;
    double rate,totalAmt;
    Deposit()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter prinicpal : ");
    	principal=sc.nextInt();
    	System.out.println("Enter rate : ");
    	rate=sc.nextInt();
    	System.out.println("Enter time : ");
    	time=sc.nextInt();
    	
    }
    Deposit(long p,int t,double r)
    {
    	principal=p;
    	time=t;
    	rate=r;
    }
    Deposit(long p,int t)
    {
    	principal=p;
    	time=t;
    	rate=1;
    }
    Deposit(long p,double r)
    {
    	principal=p;
    	rate=r;
    	time=1;
    }
    void display() {
    	System.out.println("Principal = "+principal+"  Time = "+time+" Rate = "+rate+" Total Amount = "+totalAmt);
    	
    }
    void calcAmt()
    {
    	totalAmt=principal+(principal*rate*time)/100;
    }
	public static void main(String[] args)
	{
		Deposit a=new Deposit();
		a.calcAmt();
		a.display();
		Deposit b=new Deposit(200,2,3.0);
		b.calcAmt();
		b.display();
		Deposit c=new Deposit(15,4);
		c.calcAmt();
		c.display();
		Deposit d=new Deposit(35,2.5);
		d.calcAmt();
		d.display();
		
	}

}

/*----------------------------------OUTPUT-----------------------------------------------------
Enter prinicpal : 
23
Enter rate : 
5
Enter time : 
4
Principal = 23  Time = 4 Rate = 5.0 Total Amount = 27.6
Principal = 200  Time = 2 Rate = 3.0 Total Amount = 212.0
Principal = 15  Time = 4 Rate = 1.0 Total Amount = 15.6
Principal = 35  Time = 1 Rate = 2.5 Total Amount = 35.875
 */

import java.util.*;
public class Complex
{
	int real,img;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Real part : ");
		real=sc.nextInt();
		System.out.println("Enter Imaginary part : ");
		img=sc.nextInt();
	}
	void display()
	{
		System.out.println(real+"+i"+img);
	}
	public Complex add(Complex a, Complex b)
	{
		Complex c=new Complex();
		c.real=a.real+b.real;
		c.img=a.img+b.img;
		return c;
	}
	public static void main(String[] args)
	{
		Complex x=new Complex();
		Complex y=new Complex();
		x.setData();
		y.setData();

		Complex z=new Complex();
		z=z.add(x,y);

		System.out.println("The two complex numbers are ");
		x.display();
		y.display();
		System.out.print("Their sum is ");
		z.display();

	}

}
/* OUTPUT-----
Enter Real part : 
1
Enter Imaginary part : 
3
The two complex numbers are 
3+i4
1+i3
Their sum is 4+i7
*/

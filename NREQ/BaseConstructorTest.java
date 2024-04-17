class Base{
	int a;
	Base(int a)
	{
		this.a=a;
	}
	void getBase()
	{
		System.out.println("In Base a="+a);
	}
}
class Derive extends Base{
	int b;
	Derive(int a,int b)
	{
		super(a);
		this.b=b;
	}
	void getDerive()
	{
		System.out.println("In Derive b="+b);
	}
}
class Derive2 extends Derive{
	int c;
	Derive2(int a,int b,int c)
	{
		super(a,b);
		this.c=c;
	}
	void getDerive2() {
		getBase();
		getDerive();
   // System.out.println("In Base a="+a);
   // System.out.println("In Derive b="+b);
		System.out.println("In Derive2 c="+c);
	}
}
public class BaseConstructorTest {

	public static void main(String[] args) {
		Derive2 ob=new Derive2(10,20,30);
		ob.getDerive2();

	}

}

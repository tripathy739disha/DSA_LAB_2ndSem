class Basee{
	int a;
	Basee(int a)
	{
		this.a=a;
	}
	void getA()
	{
		System.out.println("In Base a="+a);
	}
}
class Derivee extends Basee{
	int a;
	Derivee(int a)
	{
		super(a);
		this.a=a+2;
	}
	void getA()
	{
		System.out.println("In Derive a="+a);
	}
}
class Derivee2 extends Derivee{
	int a;
	Derivee2(int a)
	{
		super(a);
		this.a=a+3;
	}
	void getA() {
		//getBase();
		//getDerive();
		System.out.println("In Derive2 a="+a);
	}
}
public class BaseConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derivee2 ob=new Derivee2(10);
		ob.getA();
	}

}

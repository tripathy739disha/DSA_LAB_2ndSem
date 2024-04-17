abstract class MyClass{
	abstract int calculate(); //zero defination method - to have control on my project
}

class Square extends MyClass{
	//The type Derive1 must implement the inherited abstract method MyClass.calculate()
	int a;
	Square(int a){
		this.a=a;
	}
	int calculate()
	{
		return a*a;
	}
}
class Cube extends MyClass{
	int a;
	Cube(int a){
		this.a=a;
	}
	int calculate() {
		return a*a*a;
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		
		Square s=new Square(2);
		System.out.println("Square="+s.calculate());
		
		Cube c=new Cube(2);
		System.out.println("Cube="+c.calculate());

	}

}

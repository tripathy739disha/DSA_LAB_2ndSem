class Person{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person{
	int Eid;
	double salary;
	Employee(String name,int age,int Eid,double salary)
	{
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void empDisplay()
	{
		System.out.println("Name: "+super.name);
		System.out.println("Age : "+super.age);
		System.out.println("Employee ID : "+Eid);
		System.out.println("Salary : "+salary);
	}
}

class PersonEmployee{
	public static void main(String args[])
	{
		Employee amr=new Employee("Amaresh",21,47,15000.0);
		amr.empDisplay();
		
		Employee khushi=new Employee("Khushi Singh",18,43,70000);
		khushi.empDisplay();
		
	}
}
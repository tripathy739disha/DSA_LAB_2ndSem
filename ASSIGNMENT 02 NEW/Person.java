

import java.util.Scanner;

public class Person {
	String name;
	int age;
	void setData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter age : ");
		age=sc.nextInt();
	}
	void displayData()
	{
		System.out.println("Name is "+name+" with age "+age+" years old");
	}
	public static void main(String[] args) {
		
		Person ob1=new Person();
		ob1.name="Rohan";
		ob1.age=20;
		
		Person ob2=new Person();
		ob2.setData();
		ob1.displayData();
		ob2.displayData();

	}

}
/* OUTPUT --------------------------------
Enter name : 
Amaresh 
Enter age : 
21
Name is Rohan with age 20 years old
Name is Amaresh  with age 21 years old
*/

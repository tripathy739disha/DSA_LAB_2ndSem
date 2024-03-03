import java.util.*;
public class BMI {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person Weight in kg: ");
		float w=sc.nextFloat();
		System.out.println("Enter height of person in meter: ");
		float h=sc.nextFloat();
		
		float bmi= w/(h*h);
		
		if(bmi<18.5f)
		    System.out.println("The person is Underweight");
		else if(bmi<24.9f)
			System.out.println("The person is Normal weight");
		else if(bmi<29.9f)
			System.out.println("The person is Overweight");
		else
				System.out.println("The person is Obese");
	}

}

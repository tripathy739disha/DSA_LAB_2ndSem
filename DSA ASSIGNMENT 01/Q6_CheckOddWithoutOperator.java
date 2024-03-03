import java.util.Scanner;

public class CheckOddWithoutOperator 
{
	public static boolean isOdd(int n)
	{
		if((n | 1)==n) return true;
		else return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(n+" is odd: "+isOdd(n));
	}

}

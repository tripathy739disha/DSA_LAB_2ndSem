import java.util.*;
public class SpyNumber 
{
   static boolean isSpy(int n)
   {
	   int s=0,p=1;
	   while(n!=0)
	   {
		   s+=n%10;
		   p*=n%10;
		   n/=10;
	   }
	   return s==p;
   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		if(isSpy(n))
			System.out.println(n+" is a spy number");
		else
			System.out.println(n+" is not a spy number");
	}

}

import java.util.*;
public class Product
{
	int prodId,price,quantity;
	static int total_price;
	static int count=1;
	Product()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details of Product "+(count++));
		System.out.print("Product Id : ");
		prodId=sc.nextInt();
		System.out.print("Price : ");
		price=sc.nextInt();
		System.out.print("Quantity : ");
		quantity=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("Deatils of product "+(count++));
		System.out.println("ProdId="+prodId+"\tPrice="+price+"\tQuantity="+quantity);
	}
	
	public static void main(String[] args)
	{
		Product[] prod=new Product[5];
		for(int i=0;i<5;i++)
		{
			prod[i]=new Product();
		}
		System.out.println("-----------------------------------------------------");
		Product.count=1;
		for(int i=0;i<5;i++)
		{
			prod[i].display();
			Product.total_price+=prod[i].price*prod[i].quantity;
		}
		System.out.println("Your Total Bill is "+Product.total_price);
	}

}

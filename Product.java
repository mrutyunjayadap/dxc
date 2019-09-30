package assignment;

import java.util.Scanner;

public class Product {
	
	public static void main(String[] args) {
		Product p1= new Product();
		p1.display();
		/*Product p2= new Product();
		p2.display();
		Product p3= new Product();
		p3.display();
		Product p4= new Product();
		p4.display();
		Product p5= new Product();
		p5.display();*/
		System.out.println(p1);
		/*System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);*/
	}
	
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	Scanner sc=new Scanner(System.in);

	public void display() {
		System.out.println("Please enter ProductId");
		productId=sc.nextInt();
		if(productId<0)
		{
			System.out.println("Negative numbers are not allowed");
			System.out.println("Please enter ProductId");
			productId=sc.nextInt();
		}
		
		System.out.println("Please enter productName");
		productName=sc.next();
		
		System.out.println("Please enter quantityOnHand");
		quantityOnHand=sc.nextInt();
		if(quantityOnHand<0)
		{
			System.out.println("Negative numbers are not allowed");
			System.out.println("Please enter quantityOnHand");
			quantityOnHand=sc.nextInt();
		}
		
		System.out.println("Please enter price");
		price=sc.nextInt();
		if(price<0)
		{
			System.out.println("Negative numbers are not allowed");
			System.out.println("Please enter price");
			price=sc.nextInt();
		}
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}
	

}

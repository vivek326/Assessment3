package Localstore;

import java.util.*;

public class SalesManager {
	List<Stock> s1;
	int id=0;
	public SalesManager() {
		super();
		this.s1 = new ArrayList<>();
	}
	public void additem() {
		Scanner c=new Scanner(System.in);
		System.out.println("Name of item:");
		String name=c.next();
		System.out.println("Code of item:");
		String quantity=c.next();
		System.out.println("quantity of item:");
		String cost=c.next();
		System.out.println("Cost:");
		String code =c.next();
		
		
		Stock s=new Stock(id,name,quantity,cost,code);
		s1.add(s);
		id++;
   
	}
	public void update() {
		Scanner u=new Scanner(System.in);
		System.out.println("Enter item to update:");
		String name=u.next();
		int index=0;
		for(Stock i:s1) {
			if(name.equals(i.name))
			{
				index=s1.indexOf(i);
				
				break;
			}
		}
		s1.set(index,update2(s1.get(index).id));
		
   
	}
	
	public Stock update2(int id) {
		int flag=0;
		String name="";
		String quantity="";
		String cost="";
		String code="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		name=sc.next();
		System.out.println("quantity:");
		quantity=sc.next();
		System.out.println("Cost:");
		cost=sc.next();
		System.out.println("Code:");
		code=sc.next();
		Stock s2=new Stock(id,name,quantity,cost,code);
		return s2;
	}

	public void buy() {
		Scanner q=new Scanner(System.in);
		System.out.println("Enter item to buy:");
		String name=q.next();
		System.out.println("Enter quantity:");
		int quan=q.nextInt();
		int cost=0;
		int index=0;
		for(Stock i:s1) {
			if(name.equals(i.name))
			{
				index=s1.indexOf(i);
				int item = Integer.parseInt(i.quantity);
				cost = Integer.parseInt(i.code);
				break;
			}
		}
		System.out.println("you have to pay: ");
		System.out.println(cost*quan);
	
		
		
	}
	public void delete() {
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Item to delete:");
		String name=r.next();
		int index1=0;
		for(Stock e:s1) {
			if(name.equals(e.name))
			{
				index1=s1.indexOf(e);
				
				break;
			}
		}
		s1.remove(index1);
	}
}


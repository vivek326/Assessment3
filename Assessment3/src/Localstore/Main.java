package Localstore;

import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int option = 0;
		SalesManager m=new SalesManager();
//	      

	        Scanner s = new Scanner(System.in);
	        do{
	            System.out.println("\nStore Menu");
	            System.out.println("1. Add item");
	            System.out.println("2. Update item");
	            System.out.println("3. Print all stock items");
	            System.out.println("4. delete item ");
	            System.out.println("5. Buy item");
	            System.out.println("6. Print invoice");
	            System.out.println("7.Exit");
	            System.out.print("\nOption > ");
	            option = s.nextInt();
	            switch (option){
	                case 1:
	                     m.additem();  
	                    break;
	                case 2:
	                  m.update();
	                	
	                	break;
	                case 3:
	                	  System.out.println("Id   Name  Quantity   Cost  Code ");
		                	for(Stock i:m.s1) {
		                		System.out.println(i);
		                	}
	                	break;
	                case 4:
		                   
	                	m.delete();
	                	break;
	                case 5:
		                   
	                	m.buy();
	                	break;
	                case 6:
	                	
	                	break;
	                case 7:
	                	
	                	break;
	                default:
	                	option=7;
	                	break;
	            }
	        }while ( option !=7);

	}

}

package Localstore;

import java.util.*;

public class Stock {
 
	String name;
	String quantity;
	String cost;
	String code;
	int id;
	public Stock(int id,String name, String quantity, String cost, String code) {
		super();
		this.id=id;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.code = code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}


@Override 
public String toString() {
	return " " + id+"    " + name + "     " + quantity + "       " + cost + "     " +code;
} 
}


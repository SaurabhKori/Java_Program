package Comprable;

public class Products implements Comparable<Products> {
	String name;
	String color;
	long price;
	
	public Products(String name, String color, long price) {
		
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public int compareTo(Products c) {
		
//		return (int)(this.price-c.price);
		return this.color.compareTo(c.color);
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}

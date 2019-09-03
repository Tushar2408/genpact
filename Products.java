package p3;

public class Products implements Comparable<Products> {
	int price;
	int rating;
	String name;
	
	public Products(int price, int rating, String name) {
		super();
		this.price = price;
		this.rating = rating;
		this.name = name;
	}
	@Override
	public String toString() {
		return "name: "+this.name+"  price: "+this.price+"  rating: "+this.rating;
	}
	@Override
	public int compareTo(Products st){  
		return name.compareTo(st.name);
	}
}

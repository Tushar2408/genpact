package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Products> ts1 = new TreeSet<Products>();
		ts1.add(new Products(7000,9,"mobile"));
		ts1.add(new Products(1000,6,"smartwatch"));
		ts1.add(new Products(90000,8,"macbook"));
		
		System.out.println("Acc. to name:  "+ts1);
		
		ArrayList<Products> al = new ArrayList<Products>(ts1);
		
		Collections.sort(al,new RatingComparator());
		System.out.println("Acc. to rating:  "+al);
		
		Collections.sort(al,new PriceComparator());
		System.out.println("Acc. to price:  "+al);
	}
}

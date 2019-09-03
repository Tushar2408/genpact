package p3;

import java.util.Comparator;

public class RatingComparator implements Comparator<Products> {
	public int compare(Products s1,Products s2){  
//		Products s1=(Products)o1;  
//		Products s2=(Products)o2;  
		  
		if(s1.rating==s2.rating)  
		return 0;  
		else if(s1.rating>s2.rating)  
		return 1;  
		else  
		return -1;  
		}  
}

package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a) Declare An Array for {3,2,11,4,6,7};	 
		
		int[] a= {3,2,11,4,6,7};
		
		// b) Declare another Array for {1,2,8,4,9,7};
		
		int[] b = {1,2,8,4,9,7};
		
		// c) create a two empty Lists - list1 & list2
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
 		
		// d) Declare for loop iterator from 0 to array a.length and add into list1
		
		for (int i=0;i<a.length;i++)
		{
		list1.add(a[i]);
		System.out.println(list1);
		}
		
		// e) Declare for loop iterator from 0 to array b.length and add into another list2
		
		for (int j=0;j<b.length;j++)
		{
			list2.add(b[j]);
			System.out.println(list2);	
		}
		
		
		
		// f) Compare Both list1 & list2 using a nested for loop
		for (int i=0; i <list1.size(); i++) {
		for (int j=0; j <list2.size(); j++) {
		if (list1.get(i)==list2.get(j))
		{
			
		// g)  1)Print the matching number
		System.out.println("Matching number :"+list1.get(i));
		
		}	
		}
		
		}

	}

}
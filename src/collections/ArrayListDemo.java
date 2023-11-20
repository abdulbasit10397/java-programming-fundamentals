package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<String>();
		list1.add("Muhammad Aslam");
		list1.add("Abdul Basit");
		list1.add("Usama");
		list1.add("Abu Bakar");
		
		//Below statement is to print elements
		//System.out.println(list1);
		
		//Traversal through Iterator
		Iterator<String> iterator1= list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println();
		
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(50);
		list2.add(25);
		list2.add(524);
		list2.add(12);
		//Below statement is to print elements
		//System.out.println(list2);
		
		//Traversal through For-Each Loop
		for(Integer i: list2)
		{
			System.out.println(i);
		}

	}

}

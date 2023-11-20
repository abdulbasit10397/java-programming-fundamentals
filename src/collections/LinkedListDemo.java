package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void addItems(LinkedList<String> list1)
	{
		list1.addFirst("First Element");
		list1.add("Muhammad Aslam");
		//Adding at a specific index
		list1.add(2, "Brothers");
		list1.add("Abdul Basit");
		list1.add("Usama");
		list1.add("Abu Bakar");
		list1.addLast("Last Element");
	}

	public static void removeItems(LinkedList<String> list1)
	{
		list1.remove(2);
	}
	
	public static void deleteAllItems(LinkedList<String> list1)
	{
		list1.clear();
	}

	public static void showItems(LinkedList<String> list1)
	{
		//Traversal through Iterator
		Iterator<String> iterator1= list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<String> list1= new LinkedList<String>();
		addItems(list1);
		showItems(list1);
		removeItems(list1);
		showItems(list1);
		
		System.out.println("Output after clearing!");
		deleteAllItems(list1);
		showItems(list1);
		


	}

}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class HashSetDemo {

	public static void addItem(HashSet<String> fruits) {
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Carrot");
		fruits.add("Mango");
		fruits.add("Orange");
		//Adding Orange again but it will save Orange only once
		//because Hashset does not contain duplicate elements
		fruits.add("Orange");

	}

	public static void removeItem(HashSet<String> fruits) {
		fruits.remove("Orange");
	}
	
	public static void searchItem(HashSet<String> fruits) {
		if(fruits.contains("Mango"))
		{
			System.out.println("Item Found...!");
		}
		else 
		{
			System.out.println("Item not found... !");
			
		}
		System.out.println();

	}
	
	public static void deleteAllItems(HashSet<String> fruits) {
		fruits.clear();
		System.out.println("Deleted all fruits...!");

	}
	
	public static void showItems(HashSet<String> fruits) {
		
		//Output order will be different from insertion order
		for(String s:fruits)
		{
			System.out.println(s);
		}
		System.out.println();
	}
	
	public static void convertHashSetIntoArray(HashSet<String> fruits)
	{
		//To convert Hashset into an Array
		String[] fruitsArray= new String[fruits.size()];
		fruits.toArray(fruitsArray);
		System.out.println("Elements in Fruit Array are: ");
		for(int i=0; i<fruitsArray.length; i++)
		{
			System.out.println(fruitsArray[i]);
		}
		System.out.println();
	}
	
	public static void sortHashSetValues(HashSet<String> fruits)
	{
		//Convert hashset into array list and call sort method of Collections
		ArrayList<String> fruitsList=new ArrayList<>();
		//Converting into arraylist
		fruitsList.addAll(fruits);
		//Applying sorting method on arraylist
		Collections.sort(fruitsList);
		System.out.println("Sorted Fruits through ArrayList: ");
		
		//Printing sorted Arraylist of Fruits
		Iterator<String> iterator=fruitsList.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		System.out.println();
	}
	
	public static void sortThroughTreeSet(HashSet<String> fruits)
	{
		//TreeSet is sorted by default so we are converting
		//HashSet into TreeSet
		TreeSet<String> fruitsSet= new TreeSet<String>();
		fruitsSet.addAll(fruits);
		//Printing values
		Iterator<String> iterator=fruitsSet.iterator();
		
		System.out.println("Sorted Fruits through TreeSet: ");
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		HashSet<String> fruits= new HashSet<String>();
		addItem(fruits);
		showItems(fruits);
		removeItem(fruits);
		System.out.println("Removed an item... !");
		showItems(fruits);
		searchItem(fruits);
		convertHashSetIntoArray(fruits);
		sortHashSetValues(fruits);
		sortThroughTreeSet(fruits);

	}

}

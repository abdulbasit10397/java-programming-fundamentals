package collections;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap= new HashMap<>();
		
		myMap.put(100, "M Aslam");
		myMap.put(101, "Abdul Basit");
		myMap.put(102, "Usama Ashraf");
		myMap.put(103, "M Abu Bakar");
		
		//Traversing over map and printing values
		System.out.println("Traversing through Map using Iterator");
		Set<Entry<Integer, String>> set= myMap.entrySet();
		Iterator<Entry<Integer, String>> iterator= set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> mapEntry= 
					(Map.Entry<Integer, String>)iterator.next();
			
			System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
			
		}
		
		System.out.println("\n");
		
		System.out.println("Traversing through Map using For Loop");
		for(Map.Entry<Integer, String> mapEntry2: myMap.entrySet() )
		{
			System.out.println(mapEntry2.getKey() + " " + mapEntry2.getValue());
		}	

	}

}

package collections;

import java.util.HashMap;
import java.util.Map;

public class MapFunctionsDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> myMap= new HashMap<>();

		myMap.put(100, "M Aslam");
		myMap.put(101, "Abdul Basit");
		myMap.put(102, "Usama Ashraf");
		myMap.put(103, "M Abu Bakar");
		
		showMap(myMap);
		
		//Removing object from map
		myMap.remove(100);
		myMap.remove(101, "Abdul Basit");
		showMap(myMap);
		
		//Searching key in map and returning true if found
		System.out.println("Does Usama Exists in Map:" + myMap.containsKey(102));

		
		

	}
	
	public static void showMap(HashMap<Integer, String> myMap)
	{
		System.out.println("Map Values are: ");
		for(Map.Entry<Integer, String> mapEntry2: myMap.entrySet() )
		{
			System.out.println(mapEntry2.getKey() + " " + mapEntry2.getValue());
		}
		System.out.println();

	}



}

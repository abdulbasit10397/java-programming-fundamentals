package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		//TreeMap has sorted values
		TreeMap<Integer, String> myMap= new TreeMap<>();

		myMap.put(103, "M Abu Bakar");
		myMap.put(101, "Abdul Basit");
		myMap.put(100, "M Aslam");
		myMap.put(102, "Usama Ashraf");
			
		showMap(myMap);
		
		
	}
	
	public static void showMap(TreeMap<Integer, String> myMap)
	{
		System.out.println("Map Values are: ");
		for(Map.Entry<Integer, String> mapEntry2: myMap.entrySet() )
		{
			System.out.println(mapEntry2.getKey() + " " + mapEntry2.getValue());
		}
		System.out.println();

	}

}

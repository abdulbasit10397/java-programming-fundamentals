package collections;

//Program to check whether the string characters are unique or not
import java.util.HashMap;
import java.util.Map;

public class MapExerciseUniqueString {

	public static void main(String[] args) {
		String string="Japan";
		String myString=string.toLowerCase();
		HashMap<Character, Integer> stringMap= new HashMap<>();
		
		for(int i=0; i<myString.length(); i++)
		{
			Character character=myString.charAt(i);
			if(!stringMap.containsKey(character))
			{
				stringMap.put(character, 1);
			}
			else 
			{
				int value=stringMap.get(character);
				value++;
				stringMap.put(character, value);
				
			}
		}
		
		showMap(stringMap);
		checkIfUniqueString(stringMap);
		

	}
	
	public static void checkIfUniqueString(HashMap<Character, Integer> myMap)
	{
		for(Map.Entry<Character, Integer> mapEntry2: myMap.entrySet() )
		{
			if(mapEntry2.getValue()>1)
			{
				System.out.println("String does not contain unique characters !");
				System.exit(0);				
			}
		}
		System.out.println("String consists of unique characters !");
		System.out.println();

	}
	
	public static void showMap(HashMap<Character, Integer> myMap)
	{
		System.out.println("Map Values are: ");
		for(Map.Entry<Character, Integer> mapEntry2: myMap.entrySet() )
		{
			System.out.println(mapEntry2.getKey() + " " + mapEntry2.getValue());
		}
		System.out.println();

	}

}

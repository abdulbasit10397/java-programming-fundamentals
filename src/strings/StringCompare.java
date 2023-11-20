package strings;

public class StringCompare {

	public static void main(String[] args) {
		
		
		String str1="Hello";
		String str2="Hello";
		String str3="Basit";
		String str4= new String("Hello");
		
		//Using Equals Method
		//equals() compares content
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println("-----------------------------\n");

		//Using == operator
		//== operator compares reference 
		//that's why (str1==str4) is false
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		System.out.println("-----------------------------\n");
		
		//using compareTo() method
//		The value 0 if the argument is a string lexicographically equal to this string;
//		a value less than 0 if the argument is a string lexicographically greater than this string; 
//		and a value greater than 0 if the argument is a string lexicographically less than this string.
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		
		
	}

}

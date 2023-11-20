package strings;

public class StringCreation {

	public static void main(String[] args) {
		
		//Creating string using string literal
		String str1="Welcome";	
		System.out.println(str1);
		
		//Creating string through character array
		char[] charArray= {'H','e','l','l','o',};
		String str2= new String(charArray);
		System.out.println(str2);
		
		//Creating string using new keyword
		String str3= new String("There !");
		System.out.println(str3);
	}

}

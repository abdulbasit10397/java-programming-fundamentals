package strings;

public class SubStrings {

	public static void main(String[] args) {
		String introduction="Hi, My name is Abdul Basit";
		
		//Giving startIndex only
		String subString1=introduction.substring(4);
		System.out.println(subString1);
		
		//Giving startIndex and endIndex
		String subString2=introduction.substring(15, 20);
		System.out.println(subString2);

	}

}

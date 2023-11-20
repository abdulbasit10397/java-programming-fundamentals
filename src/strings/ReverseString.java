package strings;
//Reversing a string

public class ReverseString {

	public static void main(String[] args) {
		String originalString="Hello";

		char[] strArray=originalString.toCharArray();
		int length=strArray.length-1;
		char[] reverseString=new char[strArray.length];

		for(int i=length, j=0; i>=0; i--,j++)
		{

			reverseString[j]=strArray[i];
		}

		System.out.println(reverseString);

	}

}

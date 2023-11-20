package strings;
//Palindrome is a word which is same if we read it forward and backword
// for example refer

public class IsPalindrome {

	public static void main(String[] args) {
		String originalString="civic";
		
		char[] strArray=originalString.toCharArray();
		int length=strArray.length-1;
		char[] reverseString=new char[strArray.length];
		
		for(int i=length, j=0; i>=0; i--,j++)
		{
			
			reverseString[j]=strArray[i];
		}
		
		System.out.print("Original String: ");
		System.out.println(strArray);
		System.out.print("Reversed String: " );
		System.out.println(reverseString);
		
		for(int i=0; i<strArray.length; i++)
		{
			if(strArray[i]!=reverseString[i])
			{
				System.out.println("String is not a palindrome.");
				System.exit(0);
				
			}
		}
		System.out.println("String is Palindrome");
		
	}

}

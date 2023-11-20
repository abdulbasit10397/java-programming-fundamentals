package strings;

import java.util.Scanner;

//computing length of a string without using any string function
public class ComputeStringLength {

	public static void main(String[] args) {
		String str="";
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter string to compute length: ");
		str=scanner.nextLine();
		int length=0;
		
		//First convert string to character array because
		//string is an object and we can't compute length of
		//and object
		char strArray[]=str.toCharArray();
		for(char c:strArray)
		{
			length++;
		}
		
		System.out.println("Length of String: " + length);
		scanner.close();
	}

}

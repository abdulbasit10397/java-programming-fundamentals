package strings;
//Copying one string into another
public class CopyStrings {

	public static void main(String[] args) {
		String str="Hi i am basit";

		char[] strArray=str.toCharArray();
		int size=strArray.length;
		
		char[] name= new char[size];
		
		for (int i=0; i<size; i++)
		{
			name[i]=strArray[i];
		}
		
		
		System.out.println(name);
	}

}

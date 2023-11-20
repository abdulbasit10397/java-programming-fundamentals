package strings;

public class ReverseStringThroughStringBuilder {

	public static void main(String[] args) {
		String string1="Hi i am Basit";
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(string1).reverse();
		System.out.println(stringBuilder);

	}

}

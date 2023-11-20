package methodoverloading;

public class TypePromotion {
	
	public static void show()
	{
		System.out.println(" No Arguments");
	}
	
	public static void show(int i)
	{
		System.out.println("Integer Type of Argument: " + i);
		
	}
	
	public static void show(double d)
	{
		System.out.println("Double Type of Argument: " + d);
		
	}


	public static void main(String[] args) {
		show();
		show(450);
		//Will call show with Integer type of Parameter. This is called type promotion
		//because Java promotes character to next available type which is integer
		//97 in output is the ASCII value of A
		show('a');
		//Float will be promoted to double type
		show(45.7f);
	}

}

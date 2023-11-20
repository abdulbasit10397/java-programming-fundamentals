package superkeywordlecture;

class One{
	int i;
	void display(int i)
	{
		System.out.println("Variable of superclass: " +i);
	}
}

class Two extends One{
	int j;
	void display(int j)
	{
		//invoke method of superclass
		super.display(50);
		System.out.println("Variable of subclass: " +j);
	}
}

public class SuperMethodClass {

	public static void main(String[] args) {
		Two two= new Two();
		two.display(15);

	}

}

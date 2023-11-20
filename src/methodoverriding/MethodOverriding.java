package methodoverriding;

class Parent{
	int x;
	void show(int x)
	{
		this.x=x;
		System.out.println("Value of x in parent: "+ x);
	}
}

class Child extends Parent{
	void show(int x)
	{
		this.x=x;
		System.out.println("Value of x in child: "+ x);
	}
}
public class MethodOverriding {	

	public static void main(String[] args) {
		Parent c= new Child();
		c.show(45);

	}

}

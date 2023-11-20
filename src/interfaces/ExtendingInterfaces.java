package interfaces;

interface A
{
	void m1();
}

interface B extends A
{
	void m2();
}

public class ExtendingInterfaces implements B {
	@Override
	public void m1() {
		System.out.println("Inside method 1");
		
	}

	@Override
	public void m2() {
		System.out.println("Inside method 2");
		
	}

	public static void main(String[] args) {
		ExtendingInterfaces mInheritance= new ExtendingInterfaces();
		mInheritance.m1();
		mInheritance.m2();

	}
}

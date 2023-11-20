package diferencebetween_abstractclass_interface;

interface Inters
{
	void a();
	void b();
	void c();
	void d();
}

abstract class MyClass implements Inters
{
	public void a()
	{
		System.out.println("Inside Method A");
	}
}
class MySub extends MyClass
{

	@Override
	public void b() {
		System.out.println("Inside Method B");
	}

	@Override
	public void c() {
		System.out.println("Inside Method C");
	}

	@Override
	public void d() {
		System.out.println("Inside Method D");
	}
	
}

public class AbstractInterfaceDemo {

	public static void main(String[] args) {
		MySub mySub = new MySub();
		mySub.a();
		mySub.b();
		mySub.c();
		mySub.d();

	}

}

package interfaces;

import javax.lang.model.type.DeclaredType;

interface Jar
{
	static int volume(int a)
	{
		return (a*a*a);
	}
}
public class StaticMethodsInInterface implements Jar {
	
	//The below method has same signature as the method in interface
	//but it's not overridden because static methods belong to their own
	//interface/class rather than an object. Their scope is limited to the class
	//they are declared in. So they are identified at compile time
	//and not at runtime
	static int volume(int a)
	{
		return (a*a*a);
	}
	public static void main(String[] args) {
		System.out.println(Jar.volume(4));
		System.out.println(StaticMethodsInInterface.volume(5));
	}

}

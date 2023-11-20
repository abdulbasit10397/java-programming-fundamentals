package lambdaexpressionslecture;

@FunctionalInterface
interface MyInterface
{
	public void printHello();
}

//The interface implementation below can be skipped and 
//the example is shown in the file "LambdaExpressionDemo2"
class MyClass implements MyInterface
{

	@Override
	public void printHello() {
		System.out.println("Hey, Hello from interface implementation ... !");
		
	}
	
}


public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		MyInterface myInterface= new MyClass();
		myInterface.printHello();

	}

}

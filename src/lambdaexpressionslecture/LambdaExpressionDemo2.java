package lambdaexpressionslecture;
//In file "LambdaExpressionDemo", the interface implementation was provided
//but here the concept of lambda expressions is implemented which
//skipped the interface implementation


@FunctionalInterface
interface MyInterface2
{
	public void printHello();
}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		MyInterface2 myInterface2=()-> System.out.println
				("Hello from Lambda Expression ... !");
		myInterface2.printHello();

	}

}

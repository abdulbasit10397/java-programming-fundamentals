package lambdaexpressionslecture;

@FunctionalInterface 
interface OneArgument
{
	public int square(int x);
}

@FunctionalInterface 
interface TwoArgument
{
	public int product(int x, int y);
}

public class LambdaOneArgument {

	public static void main(String[] args) {
		
		System.out.println("**********One Argument ************");
		OneArgument oneArgument= (x)->  x*x;
		int squareOfNum=oneArgument.square(8);
		System.out.println(squareOfNum);
		System.out.println();
		
		System.out.println("**********Two Arguments************");
		TwoArgument twoArgument= (x,y) -> x*y;
		int productofNums=twoArgument.product(10, 5);
		System.out.println(productofNums);
		

	}

}

package lambdaexpressionslecture;

public class LambdaInThreads {

	public static void main(String[] args) {
		
		Runnable r=()->{
			for(int i=0; i<5; i++)
				System.out.println("Child Thread "+ i);
		};
		
		r.run();

	}

}

package functionandconsumer;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		//Function Example
		Function<String, Integer> f= s-> s.length();
		System.out.println("Length: " + f.apply("Hi, I am Abdul Basit."));
	
		Function<Integer, Integer> function= i-> i*i;
		System.out.println("Square: " + function.apply(10));
		

		//Consumer Example
		Consumer<String> cs= s->System.out.println(s);
		cs.accept("Hello from Lambda Consumer... !");
	}

}

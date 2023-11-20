package lambdaexpressionslecture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p= I -> I>10;
		System.out.println("Is number greated than 10? : " + p.test(6));
		
		Predicate<Collection<Integer>> p2= C -> C.isEmpty();
		
		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList.add(10);
		arrayList.add(18);
		arrayList.add(23);
		
		System.out.println("Is ArrayList emppty? : " + p2.test(arrayList));

	}

}

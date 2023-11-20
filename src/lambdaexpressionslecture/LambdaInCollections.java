package lambdaexpressionslecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaInCollections {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList.add(3);
		arrayList.add(10);
		arrayList.add(95);
		arrayList.add(22);
		arrayList.add(45);
		
		System.out.println("Before Sorting");
		for(int i: arrayList)
		{
			System.out.println(i);
		}
		System.out.println();
		
		//Sorting using Lambda. Sorting logic is given here
		Collections.sort(arrayList, (i1, i2)-> (i1>i2)?-1: (i1<i2)?1:0);
		System.out.println("After Soring: ");		
		for(int j: arrayList)
		{
			System.out.println(j);
		}

	}

}

//The whole below code can be skipped using a Lambda expression.
//The following code is commented to implement it through lambda
class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1>o2)
			return -1;
		else if(o1<o2)
			return 1;
		else {
			return 0;
			
		}
	}
	
}

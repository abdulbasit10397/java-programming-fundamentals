package javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplicationDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList.add(3);
		arrayList.add(10);
		arrayList.add(95);
		arrayList.add(22);
		arrayList.add(45);
		
		System.out.println(arrayList);
		
		List<Integer> arrayListEven=
				arrayList.stream().filter(i-> i%2==0).collect(Collectors.toList());
		
		System.out.println(arrayListEven);
		
	}

}

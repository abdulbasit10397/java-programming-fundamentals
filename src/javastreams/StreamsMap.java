package javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsMap {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> marks= new ArrayList<>();
		marks.add(33);
		marks.add(21);
		marks.add(65);
		marks.add(70);
		marks.add(80);
		
		//Giving Grace Marks
		List<Integer> graceMarksList=
				marks.stream().map(i-> i+5).collect(Collectors.toList());
		System.out.println(graceMarksList);
	
		//Count students who failed
		long failedStudents=marks.stream().filter(m-> m<35).count();
		System.out.println("No of Students Failed: "+failedStudents);
	
	}

}

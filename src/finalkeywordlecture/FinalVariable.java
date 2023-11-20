package finalkeywordlecture;

public class FinalVariable {

	public static void main(String[] args) {
		final int rollNo;
		rollNo=2499;
		
		//THe below statement gives an error because rollNo is declared final
		//So it can't be initialized more than once
		//rollNo=300;
		System.out.println(rollNo);
		
		

	}

}

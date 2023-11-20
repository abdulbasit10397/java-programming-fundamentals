package encapsulationlecture;

public class ReadOnlyClass {
	private String Statement="\nDBiz Solutions is a software development \n"
			+ "organization that focuses on providing quality and \n"
			+ "efficient business solutions";

	//Read only because no setter method is provided
	//Same way we can write a write only class by providing setter and no getter 
	public String getStatement() {
		return Statement;
	}

	
}

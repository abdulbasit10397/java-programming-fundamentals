package finalkeywordlecture;

class Employee{
	int id;
	String name;
	final int PIN;
	final static String companyName;
	
	//Black final static variable should be initialized in a static block
	static
	{
		companyName="DBiz Solutions";
	}
	
	
	Employee(int id, String name, int PIN) {
		this.id=id;
		this.name=name;
		//Black final variable is initialized in constructor below
		this.PIN=PIN;
	}
	
	void displayEmployeInfo()
	{
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("PIN: " + PIN );
		System.out.println("Company Name: " + companyName);
	}
}
public class BlankFinalVariable {

	public static void main(String[] args) {
		Employee emp= new Employee(1, "Abdul Basit", 10129);
		emp.displayEmployeInfo();

	}

}

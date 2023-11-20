package staticlecture;

public class StaticApplication {
	
	static 
	{
		System.out.println("Hi, Main is starting...\n");
	}

	public static void main(String[] args) {
		Employees emp1=new Employees("Abdul Basit", 10129);
		emp1.showDetails(); 
		Employees emp2=new Employees("Adeel Malik", 10145);
		emp2.showDetails();
		
		System.out.println("\nNo of Employees are: " + Employees.noOfEmployees);
	}

}

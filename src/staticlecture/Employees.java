package staticlecture;

public class Employees {
	
	String name;
	int id;
	double salary;
	String designation;
	/*companyName is made static because all the employees have
	 * same company so if we don't make it static it will make 100
	 * strings (if company has 100 employees) in employee object 
	 * which will consume a lot of memory. 
	 * To save memory, we make it static and it will be shared among 
	 * all employees. */ 
	static String companyName="Decisive Business Solutions";
	static int noOfEmployees=0;
	
	Employees(String empName, int empId)
	{
		this.name=empName;
		this.id=empId;
		noOfEmployees++;
	}
	
	public void showDetails()
	{
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Company Name: " + companyName);
	}	

}

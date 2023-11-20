package encapsulationlecture;

public class EncapsulationExample {

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setId(10129);
		employee.setName("Abdul Basit");
		employee.setDesignation("Junior Programmer");
		employee.setSalary(25000);

		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Designation: " + employee.getDesignation());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Company: " + Employee.getCompanyname());
		
		ReadOnlyClass aboutCompany= new ReadOnlyClass();
		
		System.out.println("About Company: " + aboutCompany.getStatement());
		
	}

}

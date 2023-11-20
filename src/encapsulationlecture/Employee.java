package encapsulationlecture;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int salary;
	private static final String companyName="DBiz Solutions";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static String getCompanyname() {
		return companyName;
	}

}

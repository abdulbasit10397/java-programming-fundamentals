package jdbcdemo;
import java.sql.*;

public class DatabaseApplication {

	public static void main(String[] args) throws Exception{
		
		// 1. Registering the connection
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. Establishing the connection
		System.out.println("Creating Connection...");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/UdemyJavaCourse",
						"root", "admin");
		
		System.out.println("Connection Successfully Created.");
		
		// 3. Create the statement object
		Statement st= con.createStatement();
		
		// 4. Querying the database using statement object
		System.out.println("Executing Query...");
		ResultSet rs= st.executeQuery
				("SELECT * FROM UdemyJavaCourse.UJC_EMPLOYEES Where UJC_EMPLOYEE_ID=2;");
		
		System.out.println();
		while (rs.next()) {
			System.out.println("USER ID: " + rs.getInt(1));
			System.out.println("USER Name: " + rs.getString(2));
			System.out.println();
		}
		
		
		//Closing the connection
		con.close();

	}

}

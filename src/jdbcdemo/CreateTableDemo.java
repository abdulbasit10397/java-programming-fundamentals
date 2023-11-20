package jdbcdemo;

import java.sql.*;

public class CreateTableDemo {

	public static void main(String[] args) throws Exception {

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
		String query="CREATE TABLE `UdemyJavaCourse`.`DemoTable` (\n" + 
				"  `idDemoTable` INT NOT NULL,\n" + 
				"  `nameDemoTable` VARCHAR(45) NULL,\n" + 
				"  PRIMARY KEY (`idDemoTable`));";
		st.executeUpdate(query);
		System.out.println("Table Created.");

		//Closing the connection
		con.close();

	}

}

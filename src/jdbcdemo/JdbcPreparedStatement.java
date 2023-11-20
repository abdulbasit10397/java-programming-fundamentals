package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class JdbcPreparedStatement {

	public static void main(String[] args) throws Exception {
		
		// 1. Registering the connection
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Establishing the connection
		System.out.println("Creating Connection...");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/UdemyJavaCourse",
						"root", "admin");

		System.out.println("Connection Successfully Created.");

		String query="INSERT INTO `UdemyJavaCourse`.`DemoTable` values (?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("\nPlease insert values into the table ... !");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter ID: ");
			int id=sc.nextInt();
			
			System.out.print("Enter Name:");
			String name= sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			
			ps.executeUpdate();
			System.out.println("Record inserted successfully...!");
			
			System.out.println("\nDo you want to enter more values? [Yes or No]");
			String option=sc.next();
			
			if(option.equalsIgnoreCase("No"))
			{
				break;
			}
			
		}
		
		System.out.println("Connection Closed ... !");
		sc.close();
		con.close();
		
	}

}

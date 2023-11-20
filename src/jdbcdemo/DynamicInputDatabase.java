package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class DynamicInputDatabase {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("************ Dynamic Database Menu *************");
		
		System.out.println("Enter ID: ");
		int id;
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name;
		name=sc.nextLine();
		
		
		// 1. Registering the connection
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Establishing the connection
		System.out.println("Creating Connection...");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/UdemyJavaCourse",
						"root", "admin");

		System.out.println("Successfully connected to database...!");
		
		Statement st=con.createStatement();
//
//		In following line, if you miss one comma, it will give an error So 
//		"query2", there is a simpler way of writing this
		String query="INSERT INTO `UdemyJavaCourse`.`DemoTable` "
				+ "values ("+id+", "+"'"+name+"'"+")";
		
		
		//A simple way to write the above comma extensive query
		String query2 = String.format("INSERT INTO "
				+ "`UdemyJavaCourse`.`DemoTable` "
				+ "values(%d, '%s')", id, name);
		st.executeUpdate(query2);
		
		System.out.println("Record Inserted Successfully ... !");
		sc.close();

	}

}

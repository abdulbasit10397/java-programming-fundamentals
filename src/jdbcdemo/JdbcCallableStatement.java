package jdbcdemo;
import java.sql.*;

public class JdbcCallableStatement {

	public static void main(String[] args) throws Exception{

		// 1. Registering the connection
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Establishing the connection
		System.out.println("Creating Connection...");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/UdemyJavaCourse",
						"root", "admin");

		System.out.println("Connection Successfully Created.");

		CallableStatement cst=con.prepareCall
				("call UdemyJavaCourse.UpdateName");

		cst.execute();
		System.out.println("Stored Procedure 'Update Name' "
				+ "executed successfully!");

	}

}

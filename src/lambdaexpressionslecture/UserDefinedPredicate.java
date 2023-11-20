package lambdaexpressionslecture;

import java.util.Scanner;
import java.util.function.Predicate;

class User
{
	String username;
	String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
}

public class UserDefinedPredicate {

	public static void main(String[] args) {
		Predicate<User> p= u-> u.username.equals("basit106") 
				&& u.password.equals("123456");
		
		System.out.println("*****************Login*************");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name= sc.nextLine();
		
		System.out.println("Enter Password: ");
		String password= sc.nextLine();
		
		User user= new User(name, password);
		
		
		System.out.println("Credentials Correct? : " + p.test(user));
		
		sc.close();
		
	}

}

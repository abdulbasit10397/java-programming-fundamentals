package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.*;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {

			//Print Writer is used to write in files
			//If we don't catch exception, it will give a checked exception
			//Checked exceptions are checked at compile time
			PrintWriter pw= new PrintWriter(new File("abc.txt"));
			String string="Hello";
			pw.print(string);
			pw.close();

	}
}

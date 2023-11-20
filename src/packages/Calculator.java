package packages;
//Importing "CalculatorUtil" class of "packagesCalculator" package
import packagesCalculator.CalculatorUtil;

//importing "Date" class form "util" package
import java.util.Date;

public class Calculator {

	public static void main(String[] args) {
		CalculatorUtil cal= new CalculatorUtil();
		cal.add(2, 2);
		cal.subtract(10, 5);
		cal.multiply(3, 10);
		cal.divide(1000, 10);
		
		Date todayDate= new Date();
		System.out.println(todayDate);
		
		
	}

}

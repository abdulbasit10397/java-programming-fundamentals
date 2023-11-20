package interfaces;

interface Variables
{
	int x=10;
}

interface VariableInitialization
{
	//Interface variables must be initialized at the time of declaration otherwise compiler will throw
	// an error. The below statement gives an error
	//int y;
	
	int y=100;
}

public class InterfaceVariables implements Variables {

	public static void main(String[] args) {
		
		//Below statement will give an error because interface variables are by default public static and final
		//In below statement we are changing a final variable to compile time error
		//Variables.x=30;

	}

}

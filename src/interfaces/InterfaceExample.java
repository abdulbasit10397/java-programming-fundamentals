package interfaces;

interface PrintMethod
{
	int a = 10;
	void print();
}

public class InterfaceExample implements PrintMethod {
	
	@Override
	public void print() {
		System.out.println("Inside method of implementation class");
		
	}
	public static void main(String[] args) {
		
		//Invoking print through reference of implementation class
		InterfaceExample io= new InterfaceExample();
		io.print();
		
		//Invoking print through reference of interface
		PrintMethod pm= new InterfaceExample();
		pm.print();
		
	}

	
}

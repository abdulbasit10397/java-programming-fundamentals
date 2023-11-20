package methodoverriding;

class Bank{
	public int getRateOfInterest()
	{
		return 0;
	}
}

class HBL extends Bank{
	public int getRateOfInterest()
	{
		return 7;
	}
}
class ABL extends Bank{
	public int getRateOfInterest()
	{
		return 8;
	}
}
class BankIslami extends Bank{
	public int getRateOfInterest()
	{
		return 9;
	}
}
public class OverridingRateOfInterest {

	public static void main(String[] args) {
		HBL hbl= new HBL();
		int hblRate=hbl.getRateOfInterest();
		System.out.println("HBL interest rate :" + hblRate);
		
		ABL abl= new ABL();
		int ablRate=abl.getRateOfInterest();
		System.out.println("ABL interest rate :" + ablRate);
		
		BankIslami bankislami= new BankIslami();
		int biRate=bankislami.getRateOfInterest();
		System.out.println("Bank Islami interest rate :" + biRate);


	}

}

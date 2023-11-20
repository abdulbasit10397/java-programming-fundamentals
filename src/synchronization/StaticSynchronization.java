package synchronization;

class STTable
{
	//For static synchronization
	static synchronized void printTable(int n)
	{
		System.out.println("Table of " + n + ": ");
		for(int i=1; i<=10; i++)
		{
			System.out.println(n*i);

			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}//end of For Loop
	}
}

class STThreadOne implements Runnable
{
	STTable table;

	public STThreadOne(STTable table) {
		this.table=table;
	}

	@Override
	public void run() {
		table.printTable(5);

	}
}

class STThreadTwo implements Runnable
{
	STTable table;

	public STThreadTwo(STTable table) {
		this.table=table;
	}

	@Override
	public void run() {
		table.printTable(10);

	}
}


public class StaticSynchronization {

	public static void main(String[] args) {

		//We are creating 2 objects so in this case, even the printTable()
		//method is made "synchronized", the output will still be inconsistent
		//To solve this issue, Make "printTable" as static
		
		STTable st1= new STTable();
		STTable st2= new STTable();

		STThreadOne m1= new STThreadOne(st1);
		STThreadTwo m2= new STThreadTwo(st2);

		Thread t1= new Thread(m1);
		Thread t2= new Thread(m2);

		//As both t1 and t2 here are using the same resource i.e. "printTable()" method
		//The printed table will be in haphazard manner (no sequence)
		//To avoid this inconsistency, we have to use "static synchronized" keyword
		//before the resource used by multiple threads
		t1.start();
		t2.start();


	}

}

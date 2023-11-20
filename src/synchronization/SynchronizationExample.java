package synchronization;

class Table
{
	synchronized void printTable(int n)
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
		}
	}
}

class ThreadOne implements Runnable
{
	Table table;
	
	public ThreadOne(Table table) {
		this.table=table;
	}

	@Override
	public void run() {
		table.printTable(5);
		
	}
}

class ThreadTwo implements Runnable
{
	Table table;

	public ThreadTwo(Table table) {
		this.table=table;
	}

	@Override
	public void run() {
		table.printTable(10);

	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		
		Table t= new Table();
		
		ThreadOne m1= new ThreadOne(t);
		ThreadTwo m2= new ThreadTwo(t);
		
		Thread t1= new Thread(m1);
		Thread t2= new Thread(m2);
		
		//As both t1 and t2 here are using the same resource i.e. "printTable()" method
		//The printed table will be in haphazard manner (no sequence)
		//To avoid this inconsistency, we have to use "synchronized" keyword
		//before the resource used by multiple threads
		t1.start();
		t2.start();
		
		
	}

}

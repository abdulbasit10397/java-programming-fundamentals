package interthreadcommunication;

class Consumer 
{
	int amount=10000;
	synchronized void withdrawAmount(int amount)
	{
		if(amount>this.amount)
		{
			System.out.println("Insufficient funds in your account !");
			System.out.println("Balance Amount: " + this.amount);
			try {
				//Thread 1 goes into waiting state here
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.amount-=amount;
		System.out.println("Amount successfully withdrawn !");
		System.out.println("Balance Amount: " + this.amount);
	}
	
	synchronized void depositCash(int amount)
	{
		this.amount+=amount;
		System.out.println("Amount Successfully Deposited !");
		System.out.println("Balance Amount: " + this.amount);
		
		//Thread 2 notifies Thread 1 to get out of waiting state now
		notify();
	}
}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		
		 Consumer consumer= new Consumer();
		
		//Creating Thread 1
		new Thread(() -> consumer.withdrawAmount(13000)).start();
		
		//Creating Thread 2
		new Thread(() -> consumer.depositCash(5000)).start();
		
	}

}

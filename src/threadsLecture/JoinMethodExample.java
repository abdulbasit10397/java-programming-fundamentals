package threadsLecture;

class MyJoinThread implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":");
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
		}
		
	}
	
}

public class JoinMethodExample {

	public static void main(String[] args) {
	
		MyJoinThread m1= new MyJoinThread();
		MyJoinThread m2= new MyJoinThread();
		MyJoinThread m3= new MyJoinThread();

		Thread t1= new Thread(m1);
		Thread t2= new Thread(m2);
		Thread t3= new Thread(m3);
		
		t1.start();
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		
		t2.start();
		t3.start();
	}
}

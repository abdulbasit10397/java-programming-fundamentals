package threadsLecture;

class MyThread2 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi from child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadApplicationByImplementingRunnable {

	public static void main(String[] args) {

		System.out.println("Hi from main thread \n");

		MyThread2 myThread2= new MyThread2();
		Thread thread= new Thread(myThread2);
		thread.start();
	}

}

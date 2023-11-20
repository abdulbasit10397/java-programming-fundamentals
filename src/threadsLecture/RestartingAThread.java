package threadsLecture;

class MyThreadAgain extends Thread{
	public void run()
	{
		System.out.println("Hi from " + Thread.currentThread().getName() );
	}
}

public class RestartingAThread {

	public static void main(String[] args) {

		MyThreadAgain child1=new MyThreadAgain();
		
		//We are restarting a thread. For the first time, it will be started
		// But after that, it will throw IllegalThreadStateException
		child1.start();
		child1.start();

	}

}

package threadsLecture;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("From Child Thread");
	}
}

public class ThreadApplicationByExtendingThreadClass {

	public static void main(String[] args) {
		
		System.out.println("From Main Thread");
		
		MyThread t= new MyThread();
		t.start();

	}

}

package threadsLecture;

class MyFirstThread extends Thread{
	public void run()
	{
		System.out.println("Hi from " + Thread.currentThread().getName() );
	}
}

public class NamingThreads {

	public static void main(String[] args) {
		MyChildThread child1=new MyChildThread();
		child1.setName("First Born");
		child1.start();
		
		MyChildThread child2=new MyChildThread();
		child2.setName("Second Born");
		child2.start();
		
	}

}

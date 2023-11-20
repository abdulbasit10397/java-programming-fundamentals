package threadsLecture;

class MyChildThread extends Thread{
	public void run()
	{
		System.out.println("Hi from " + Thread.currentThread().getName() );
	}
}

public class RunMethodDirectly {

	public static void main(String[] args) {

		MyChildThread child1=new MyChildThread();
		child1.start();
		
		MyChildThread child2=new MyChildThread();
		child2.start();
		
		//Now in the below statements, 
		//We are invoking run() from main thread,
		//So, the run() goes onto the current call stack
		//rather than at the beginning of a new call stack.
		MyChildThread child3=new MyChildThread();
		child3.run();
		
		MyChildThread child4=new MyChildThread();
		child4.run();

	}

}

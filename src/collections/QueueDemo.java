package collections;

import java.util.Iterator;
import java.util.PriorityQueue;


public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pQueue= new PriorityQueue<>();
		pQueue.add("Apple");
		pQueue.add("Orange");
		pQueue.add("Grapes");
		pQueue.add("Coconut");
		pQueue.add("Walnut");
		
		
		Iterator<String> iterator= pQueue.iterator();
		System.out.println("Elements of Queue before: ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println("Testing different Queue functions");
		
		//Peek method returns the head of the queue
		System.out.println("Peek: " + pQueue.peek());
		
		//Poll method returns as well as removes the head of the queue 
		System.out.println("Poll:" + pQueue.poll());
		
		// Offer method adds an element into the queue and returns true
		//if adding operation is successful 
		System.out.println("Offer:" + pQueue.offer("Hi I am newly added"));
		
		//Removes an element from the queue
		System.out.println("Remove:" + pQueue.remove());
		
		// Element shows head of the queue without removing it
		System.out.println("Element:" + pQueue.element());
		System.out.println();
		
		
		Iterator<String> iterator2= pQueue.iterator();
		System.out.println("Elements of Queue after: ");
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}

	}

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedemo;


 import java.util.Scanner;
 
 /**
 * The queue data structure is tested.
 */
 public class QueueDemo {

	public static void main(String[] args) {
		Queue q = new Queue(3);
		Scanner input = new Scanner(System.in);
		String choice;
		int num;
		
		
		System.out.println("Adding 10, 13, and 6 to queue.");
		q.enqueue(10);
		q.enqueue(13);
		q.enqueue(6);
		System.out.println("Front of queue: " + q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + q.dequeue());
		System.out.println("Front of queue: " + q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + q.dequeue());
		System.out.println("Front of queue: " + q.front());
		System.out.println("Items in queue: " + q.size());
		System.out.println("Dequeueing front item: " + q.dequeue());
		
		
		//additional code for testing
//		do {
//			System.out.print("Add/Remove/Count/Front/Quit: ");
//			choice = input.next();
//			if (choice.equalsIgnoreCase("a")) {
//				System.out.print("Number to add: ");
//				num = input.nextInt();
//				q.enqueue(num);
//			} else if (choice.equalsIgnoreCase("r")) {
//				System.out.println("Dequeueing front item: " + q.dequeue());
//			} else if (choice.equalsIgnoreCase("c")) {
//				System.out.println("Items in queue: " + q.size());
//			} else if (choice.equalsIgnoreCase("f")) {
//				System.out.println("Front of queue: " + q.front());
//			} else {
//				System.out.println("quitting");
//			}
//		} while (!choice.equalsIgnoreCase("q"));
	}
}

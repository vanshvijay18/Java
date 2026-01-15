package com.multithreading;

class V1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Child thread Executing: ");
		System.out.println("Currenta Thread :: " + Thread.currentThread());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Some Problem:");
		}
		System.out.println("Task Completed ");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		
		
		System.out.println("Main Thread..........");
		V1 v = new V1();
		Thread t1 = new Thread(v);
		t1.setName("MyThread-01");
		t1.start();
		
		Thread t2 = new Thread(v);
		t2.setName("MyThread-02");
		t2.start();
		
		Thread t3 = new Thread(v);
		t3.setName("MyThread-03");
		t3.start();

	}
}

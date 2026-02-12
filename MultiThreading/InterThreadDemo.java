package com.multithreading;


	class Test {
	    synchronized void waitMethod() {
	        try {
	            System.out.println("Thread is waiting...");
	            wait();   // thread wait karega
	            System.out.println("Thread resumed!");
	        } catch (Exception e) {
	        }
	    }

	    synchronized void notifyMethod() {
	        System.out.println("Thread is notifying...");
	        notify();   // waiting thread ko utha do
	    }
	}

	public class InterThreadDemo {
	    public static void main(String[] args) {

	        Test obj = new Test();

	        Thread t1 = new Thread(() -> obj.waitMethod());
	        Thread t2 = new Thread(() -> obj.notifyMethod());

	        t1.start();
	        t2.start();
	    }
	}



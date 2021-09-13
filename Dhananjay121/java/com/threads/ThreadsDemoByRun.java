package com.threads;

class ThreadsRunDemos implements Runnable {

	public void run() { // imp method given by thread class java

		// logic part
		try {
			System.out.println("list of threads running " + Thread.currentThread());
		} catch (Exception e) {

			System.out.println("exceotion caught" + e);

		}

	}

}

public class ThreadsDemoByRun {
	public static void main(String ar[]) {

		int numberOfThreads = 2;

		for (int i = 0; i < numberOfThreads; i++) {

			ThreadsDemoByRun threadsdemosbyrun = new ThreadsDemoByRun();// created the object of a class

			threadsdemosbyrun.start();// life cycle of threads start() call the run method
			threadsdemosbyrun.setName("dk");
			threadsdemosbyrun.setPriority(6);

		}

	}

}

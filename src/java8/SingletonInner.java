package java8;

// Java Program to demonstrate Thread-Safety
// in NestedInitialization

class Singleton1 {

	private static class Nested {
		static Singleton1 Instance = new Singleton1();
	}

	// This method returns Object, does not create it
	// Object is created on initialization of Nested class
	// which happens only once.
	public static Singleton1 getInstance() {
		return Nested.Instance;
	}

	private Singleton1() {
		System.out.println("Object made");
	}
}

public class SingletonInner {
	public static void main(String[] args) {

		// Thread 1 will call getInstance
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Singleton1 a = Singleton1.getInstance();
			}
		});

		// Thread 2 will also call getInstance
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Singleton1 b = Singleton1.getInstance();
			}
		});

		// Start both the Threads
		t1.start();
		t2.start();
	}
}

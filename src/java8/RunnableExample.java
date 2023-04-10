package java8;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = () -> {System.out.println("Hello world two!");
//		Runnable runnable = new Runnable() {
//			public void run() {
//				
//		}};
		int a=1+1;
		System.out.println("Hello world THREE! "+a);};
		
		runnable.run();
	}

}

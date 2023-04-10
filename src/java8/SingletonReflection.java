package java8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//enum Singleton2 {
//	INSTANCE
//
//}

class Singleton2 {
	

	public static final Singleton2 INSTANCE = new Singleton2();

	private Singleton2() {

	}

	public Singleton2 getInstance() {
		return INSTANCE;

	}
}

public class SingletonReflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Singleton2 instance1 = Singleton2.INSTANCE;
		//Singleton2 instance2 = Singleton2.INSTANCE;
		Singleton2 instance2 = null;
		
		//Use Reflection to access the constructor
		Constructor[] cs = Singleton2.class.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			constructor.setAccessible(true);
			
			//Get new instance and assign it to a new variable to break Singleton pattern
			instance2 = (Singleton2) constructor.newInstance();
		}
		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());

	}

}

package java17;

import java.util.random.RandomGenerator;
import java.util.stream.DoubleStream;

public class Random2 {

	public static void main(String[] args) {
		RandomGenerator gen = RandomGenerator.of("L128X256MixRandom");
		//Returns a pseudorandomly chosen int value between zero(inclusive) and the specified bound (exclusive).
		System.out.printf(" Random number = %d",gen.nextInt(100));
	}

}

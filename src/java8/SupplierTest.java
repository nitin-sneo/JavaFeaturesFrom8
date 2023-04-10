package java8;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Double> sd=()->2*Math.PI;
		System.out.println(sd.get());

	}

}

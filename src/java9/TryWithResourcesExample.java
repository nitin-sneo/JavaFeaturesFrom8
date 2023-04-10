package java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {

	public static void main(String[] args) throws IOException {
		  System.out.println("*****************Before Java 9*********************");
	      System.out.println(readDataBefore("Hello World Java 8"));
	      System.out.println("*****************Before Java 9*********************");
	      System.out.println(readDataAfter("Hello World Java 9"));
	   } 
	   static String readDataBefore(String message) throws IOException {
	      Reader inputString = new StringReader(message);
	      BufferedReader br = new BufferedReader(inputString);
	      try (BufferedReader br1 = br) {
	         return br1.readLine();
	      }
	   }
	   
	   static String readDataAfter(String message) throws IOException {
		      Reader inputString = new StringReader(message);
		      BufferedReader br = new BufferedReader(inputString);
		      try (br) {
		         return br.readLine();
		      }
		   }

}

package java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryEarlier {
	
	
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new StringReader("Hello world example!"));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	

}

package java8;

import java.util.StringTokenizer;

public class Tokenize {
	
	
	 public static void main(String args[]){  
	   StringTokenizer st = new StringTokenizer("my name is Lakhan"," "); 
	   
	   
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	   }  
	  

}

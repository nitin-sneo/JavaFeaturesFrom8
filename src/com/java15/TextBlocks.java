package com.java15;

public class TextBlocks {

	public static void main(String[] args) {
		
		//Before Java 15
		System.out.println("Before Java 15");
        String s1=
        "<!DOCTYPE html>\n" +
                "<html>\n" +
                "     <head>\n" +
                "        <title>Example</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>This is an example of a simple HTML " +
                "page with one paragraph.</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(s1);
                
        
        
      //After Java 15
        String s= """
        		
        		<!DOCTYPE html>
                <html>
                    <head>
                        <title>Example</title>
                    </head>
                    <body>
                        <p>This is an example of a simple HTML 
                        page with one paragraph.</p>
                    </body>
                </html>      
                """;
        System.out.println("After Java 15");
    	System.out.println(s);
    }
	
	

}

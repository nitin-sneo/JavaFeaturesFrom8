package java17;

public class PatternMatchingNull {

	public static void main(String[] args) {

        testStringJava17("Java 16");  // Ok
        testStringJava17("Java 11");  // LTS
        testStringJava17("");         // Ok
        testStringJava17(null);       // Unknown!
    }

    static void testStringJava17(String s) {
        switch (s) {
            //case null                   -> System.out.println("Unknown!");
            case "Java 11", "Java 17"   -> System.out.println("LTS");
            default                     -> System.out.println("Ok");
        }
    }


}

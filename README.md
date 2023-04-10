# JavaFeaturesFrom8






Features introduced after Java 8





















Contents
Java 9:	3
1.	Java Module System	3
2.	Diamond Syntax with Inner Anonymous Classes	8
3.	Private Interface Methods	8
4.	Jshell	9
5.	Collection Factory Methods	9
6.	Process API improvements	10
7.	Try with resources improvements	10
8.	Java 9 - Optional Class Improvements	11
Java 10 features	11
1.	Local Variable Type Inference	11
2.	Immutable Collections	12
Java 11 features	13
1.	Collections to Array	13
2.	Reading/Writing Strings to and from the Files	13
3.	Path APi changes	13
Java 14 Features	14
1.	Switch expression	14
2.	The yield Keyword	14
3.	Null Pointer Improvement	14
Output	14
Java 15	15
1.	Text Blocks	15
Java 16	16
1.	Pattern Matching of instanceof	16
2.	Records	17
Constructor	19
Java 17 Features	22
1.	Sealed classes	22
2.	Random Number Generator	24
3.	Pattern matching and null Preview feature	25



Java 9:

1.	Java Module System

Below is a video explaining the java modules briefly
Link: https://www.youtube.com/watch?v=22OW5t_Mbnk
A module is a group of packages, their dependencies, and resources. It provides a broader set of functionalities than packages.
When creating the new module, we need to provide several attributes:
•	Name
•	Dependencies
•	Public Packages - by default, all packages are module private
•	Services Offered
•	Services Consumed
•	Reflection Permissions
Before Java 9, we had ‘packages‘ to group related classes as per business capabilities. Along with packages, we had ‘access modifiers‘ to control what would be visible and what would be hidden to other classes or packages. It has been working great so far.
But, explicit dependencies are where things start to fall apart. In Java, dependencies are declared with ‘import‘ statements; but they are strictly ‘compile time’ constructs.
Once code is compiled, there is no mechanism to state its runtime dependencies clearly. In fact, Java runtime dependency resolution is such a problematic area that special tools have been created to fight this problem e.g., gradle or maven.

Modules in java 9
Java official packages
Java official packages contains more than 100+ packages which in some way use the other packages. In order to do this we use the access modifier public. The public modifier is too broad i.e. due to this anyone can access any of the classes within the package also there is not way of directly knowing how these dependent packages are used. Java 9 tries to tackle this problem using modules. With modules we can decide which packages should be publicly accessible and which should not be.

 

JDK vs JRE
 

 
 
Access modifier in jdk vs jdk9
 

jre folder 
In fact, there is no jre sub-folder within jdk starting from jdk9.0 onward. jmods is now playing the rolls of jre.

Modules in a Program
 




 




2.	Diamond Syntax with Inner Anonymous Classes

Before Java 9 we couldn’t use a diamond operator inside the inner anonymous class.
For our example, we will create the abstract class, StringAppender. The class has only one method that appends two strings with - between them. We will use the anonymous class for providing the implementation for the append() method:

3.	Private Interface Methods

Beginning with Java 9, you can have private methods in interfaces.

Since private methods are only accessible within the interface in which it has been defined, you can take advantage of such methods to write sensitive code which you would not want to be accessed by any class or interface.
Benefits:
•	Code re-usability – Developers can leverage private interface methods to reuse code inside the declaring interface; however, you would want to hide across implementations of the interface.
•	Encapsulation – Programmers can take advantage of private interface methods to encapsulate code that you would not want to be shared across implementations of the interface.

Rules:
•	Abstract methods are not allowed in private interfaces. Private interface methods can only be used inside interfaces.
•	It is not possible to have both private and abstract modifiers at the same time.
•	A static method can be used inside a static or non-static method.
•	It is not possible to use a private non-static method within a private static method.

Private interface methods are a feature of Java that allows developers to define private methods (both static and non-static) in an interface. This is useful for defining helper methods that can be called from inside the declaring interface only.
In addition to increasing code reusability inside interfaces, private interface methods allow us to expose only the intended method implementations. Such methods are exclusive to the interface in which they are defined and cannot be accessed or inherited from any other class or interface.

4.	Jshell
With JShell, java has REPL capability. Using REPL, we can code and test java based logic without compiling using javac and see the result of calculations directly.

Open Command prompt and type jshell
To check list of imports type /imports
 
Creating method and testing the same
 

5.	Collection Factory Methods
With Java 9, new factory methods are added to List, Set and Map interfaces to create immutable instances.
static <E> List<E> of(E e1, E e2, E e3);
static <E> Set<E>  of(E e1, E e2, E e3);
static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3);
static <K,V> Map<K,V> ofEntries(Map.Entry<? extends K,? extends V>... entries)

6.	Process API improvements
Process API which is responsible to control and manage operating system processes has been improved considerably. ProcessHandle Class now provides process's native process ID, start time, accumulated CPU time, arguments, command, user, parent process, and descendants. ProcessHandle class also provides method to check processes' liveness and to destroy processes. It has onExit method, the CompletableFuture class can perform action asynchronously when process exits.

7.	Try with resources improvements
The try-with-resources statement is a try statement with one or more resources duly declared. Here resource is an object which should be closed once it is no more required. The try-with-resources statement ensures that each resource is closed after the requirement finishes. Any object implementing java.lang.AutoCloseable or java.io.Closeable, interface can be used as a resource.

Prior to Java 9, try-with-resources has a limitation that requires resource to declare locally within its block.. In this example, we'll use BufferedReader as resource to read a string and then BufferedReader is to be closed.

Before Java 9
static String readData(String message) throws IOException {
      Reader inputString = new StringReader(message);
      BufferedReader br = new BufferedReader(inputString);
      try (BufferedReader br1 = br) {
         return br1.readLine();
      }
   }




After Java 9
static String readData(String message) throws IOException {
      Reader inputString = new StringReader(message);
      BufferedReader br = new BufferedReader(inputString);
      try (br) {
         return br.readLine();
      }
   }



8.	Java 9 - Optional Class Improvements
Optional Class was introduced in Java 8 to avoid null checks and NullPointerException issues. In java 9, three new methods are added to improve its functionality.
•	stream()
o	If a value is present, it returns a sequential Stream containing only that value, otherwise returns an empty Stream.
•	ifPresentOrElse()
o	If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
•	or()
o	If a value is present, returns an Optional describing the value, otherwise returns an Optional produced by the supplying function.



Java 10 features
1.	Local Variable Type Inference

When writing and reading code, we always know which type we expect. On the other hand, a lot of the code is just types with no usability.
The var type allows us to omit type from the left-hand side of our statements.

var i = 10;
var hello = "Hello world!";
var list = List.of(1, 2, 3, 4, 5);
var httpClient = HttpClient.newBuilder().build();
var status = getStatus();

2.	Immutable Collections
With the methods Collections.unmodifiableList(), unmodifiableSet(), unmodifiableMap(), unmodifiableCollection() – and four further variants for sorted and navigable sets and maps – the Java Collections Framework offers the possibility to create unmodifiable wrappers for collection classes.
Here is an example:
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
List<Integer> unmodifiable = Collections.unmodifiableList(list);Code language: Java (java)
If we now try to add an element via the wrapper, we get an UnsupportedOperationException:
unmodifiable.add(4);

Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.Collections$UnmodifiableCollection.add(...)
	at ...

Java 11 features

1.	Collections to Array
Convert collection to Array
Changes to method ToArray
toArray(String[]::new);

2.	Reading/Writing Strings to and from the Files

Java 11 strives to make reading and writing of String convenient. It has introduced the following methods for reading and writing to/from the files:
•	readString()
•	writeString()
Following code showcases an example of this
Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
System.out.println(path);
String s = Files.readString(path);
System.out.println(s); //This was posted on JD

3.	Path APi changes
Starting with Java 11, you should use the static Path.of method to construct paths (we’ll cover the Java7-10 equivalent in a second).
// Java11+  : Path.of()

    Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
    System.out.println(path);

    path = Path.of("c:/dev/licenses/windows/readme.txt");
    System.out.println(path);

    path = Path.of("c:" , "dev", "licenses", "windows", "readme.txt");
    System.out.println(path);

    path = Path.of("c:" , "dev", "licenses", "windows").resolve("readme.txt"); // resolve == getChild()
    System.out.println(path);

    path = Path.of(new URI("file:///c:/dev/licenses/windows/readme.txt"));
    System.out.println(path);

    // Java < 11 equivalent: Paths.get()
    path = Paths.get("c:/dev/licenses/windows/readme.txt");
    System.out.println(path);


Java 14 Features
1.	Switch expression
We need to make sure that we put a break statement inside our case code block. Failing it will result in checking on other conditions after we match the first one.
We are using a bit different notation in the case block. We are using -> instead of the colon. Even though we are not invoking the break statement, we will still jump out of the switch statement on the first valid condition.

2.	The yield Keyword
The logic inside the case block can be a bit more complicated than just returning a value. For example, we want to log which month the user sent us:
In a multi-line code block, we have to use the yield keyword to return a value from a case block.

3.	Null Pointer Improvement
Java 14 introduces NullPointerException with helpful information in case -XX:+ShowCodeDetailsInExceptionMessages flag is passed to JVM.
$javac NullPointerImprovement.java
$java -XX:+ShowCodeDetailsInExceptionMessages NullPointerImprovement
Output
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "message" is null
	at trywithresources/com.java14.NullPointerImprovement.main(NullPointerImprovement.java:8)


Java 15
1.	Text Blocks
Text block is an improvement on formatting String variables. From Java 15, we can write a String that spans through several lines as regular text.
Earlier
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

Reference: https://docs.oracle.com/en/java/javase/15/text-blocks/index.html


In Java 15
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
We used special syntax for opening and closing quotes: """. This allows us to treat our string as if we are writing it in a .txt file.
Note that the result type of a text block is still a String. Text blocks just provide us with another way to write String literals in our source code.
Inside the text blocks, we can freely use newlines and quotes without the need for escaping line breaks. It allows us to include literal fragments of HTML, JSON, SQL, or whatever we need, in a more elegant and readable way.
There are some rules that we need to abide by when using a text block. We need to make sure that we put a new line after our opening quotes, or our compiler will throw an error:
Illegal text block start: missing new line after opening quotes.
If we want to end our string with \n we can do it by putting new line before closing """ like in the example above.
It may not be a game-changer, but it helps us to write better and more readable code, which is generally a good thing.

Java 16

1.	Pattern Matching of instanceof
Pattern matching on the instanceof allows us to cast our variable inline and use it inside the desired if-else block without explicitly casting it.

Without Pattern Matching
We have a base class called Vehicle and two classes that extends it: Car and Bicycle.

public static double priceOld(Vehicle v) {
        if (v instanceof Car) {
            Car c = (Car) v;
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle) {
            Bicycle b = (Bicycle) v;
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }

Since we are not using pattern matching, we need to cast the vehicle into the correct type inside each if-else block. As we can see, it is a typical example of boilerplate code for which Java is famous.

With Pattern Matching
public static double price(Vehicle v) {
        if (v instanceof Car c) {
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle b) {
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }

With Pattern matching the casting is no longer required. The scope of the casted variable it’s visible only within the if statement.

2.	Records
Java has had a bad reputation for boilerplate code. Lombok allowed us to stop worrying about getters, setters, etc. Java 16 finally introduced records to remove a lot of boilerplate code.
A record class is nothing more than regular POJO, for which most of the code is generated from the definition.
While working on Java projects, we, as developers, often write service classes, security classes, or any other basic classes. These classes are functional by nature. Similarly, programmers often write classes for the sole purpose of carrying data. For instance, suppose, a client requests some data from the server such as an id and name of a person and the server responds back with the appropriate data. Since everything is an object in Java, there must be some class that carries the data. The server responds back with the object of the class to the client. Note that the sole purpose of the object is to carry the data from the server to the client.
Now, writing such a data class, even if it may be a simple POJO, includes a lot of boilerplate code, such as private fields, constructors, getter and setter methods, hashCode(), equals(), and toString() methods. A simple carrier class becomes heavy with a lot of unnecessary code due to the verbose nature of the Java language. These downsides led to the introduction of a special type of class called record. This class aggregates – or holds – a group of values without having to write boilerplate code and acts as an efficient carrier of data objects.
 
 
A few quick points to note about the above code example:
•	The canonical constructor provided by the record class contains the same parameter passed as the list of components and in the same order. The values passed are automatically assigned to the record fields.
•	A record is instantiated by the new keyword, just like creating any other objects in Java.
•	The data in the record is held in private final fields and there is only a getter method. Therefore, data in the record is immutable.
•	A record cannot inherit another class. However, all records implicitly inherit java.lang.Record. As such, it overrides equals(), hashCode(), toString() methods of the Object class.
•	All record declarations are final, hence they cannot be extended.
•	A record, however, can implement one or more interfaces.
•	Any other fields, except the list of components, must be declared static.

Constructor
Records by default come with a constructor which initializes all fields — called a canonical constructor. Custom behavior can be passed to this constructor by using a compact constructor like in the example below:
record Person(int age, int height) {
  public Person {
    if (age < 0) {
      throw new IllegalArgumentException("Age must be positive");
    }
  }
}
The compact constructor can be used for example to validate fields — only unchecked exceptions can be thrown and you won’t be able to declare checked exceptions by adding throws declaration.
A custom constructor can be created as well but a non-canonical constructor always has to delegate to another constructor. A simple example would be as follows:


record Person(int age, int height) {
  public Person(int age) {
    this(age, 180);
  }
  public Person() {
    this(18);
  }
}
Since Java requires a call to this() to be the first statement there are very limited use cases for overridden constructors — passing default values would be one of them.
Please remember that the compact constructor is just syntactic sugar and you can still use the old way of specifying constructor with all fields:
record Person(int age, int height) {
  public Person(int age, int height) {
    this.height = height;
    this.age = age;
  }
}

Fields visibility
There is one big disadvantage of records — every field will have a public getter created.
It of course makes sense since we provide them in the constructor but it makes records to a certain extent focused on the data and not behavior.
You do not have a choice of making a field private and the following code will not compile:
record Person(private int age, int height) {}

Static fields and methods
Similarly to every other class in Java records allow static (class) methods and fields:
record Person(int age, int height) {
  private static final int adultAge = 18;

  public boolean isAdult() {
    return age >= adultAge;
  }

  public static Person newborn(int height) {
    return new Person(0, height);
  }
}

Record classes are final so they cannot be extended.
Records also extend java.lang.Record and since Java doesn’t allow multiple inheritance they cannot extend any classes or abstract classes.
It is possible to implement interfaces:



Java 17 Features
1.	Sealed classes
Sealed classes are in a sense very similar to final classes. The difference is very subtle — final classes cannot be extended at all (cannot have subclasses) and only classes can be final, an interface cannot be made final — it would not make sense.

sealed keyword accompanied by a permits keyword allows a class or an interface to be extended or implemented only by a set of specified classes or interfaces. As an example below:

sealed interface Animal permits Reptile, Bird, Mammal, Fish {
}
A very important thing to keep in mind is that extending a sealed class or interface requires using sealed or non-sealed keywords! non-sealed simply unseals it and allows it to be subclassed :-).

sealed classes are a perfect replacement for enums but to use the full power of them we need to wait until pattern matching for switch becomes production-ready.

Constraints
A sealed class imposes three important constraints on its permitted subclasses:
All permitted subclasses must belong to the same module as the sealed class.
Every permitted subclass must explicitly extend the sealed class.
Every permitted subclass must define a modifier: final, sealed, or non-sealed.

2.	Random Number Generator
This JEP introduced a new interface called RandomGenerator which aims to make future pseudorandom number generator (PRNG) algorithms easier to implement or use.
With the legacy PRNG classes Random, ThreadLocalRandom, and SplittableRandom, it is difficult to replace any of them in an application with some other algorithm because they did not have any supertype to support runtime changes.
With the introduction of RandomGenerator interface, we can inject any implementing generator class where the client uses RandomGenerator type in the application code. The new classes are:
•	SplittableGenerator – can be split into two objects (the original one and a new one) each of which obey that same protocol.
•	JumpableGenerator – can easily jump forward, by a moderate amount.
•	LeapableGenerator – can easily not only jump but also leap forward, by a large amount.
•	ArbitrarilyJumpableGenerator – can easily jump forward, by an arbitrary amount, to a distant point in the state cycle.
•	StreamableGenerator – augments the RandomGenerator interface to provide methods that return streams of RandomGenerator objects.
Also, legacy random classes, such as Java.util.Random, SplittableRandom, ThreadLocalRandom and SecureRandom now extend the new RandomGenerator interface.

3.	Pattern matching and null Preview feature
Now we can test the null in switch directly. This is a preview feature
static void testString(String s) {
      if (s == null) {
          System.out.println("Unknown!");
          return;
      }
      switch (s) {
          case "Java 11", "Java 17"   -> System.out.println("LTS");
          default                     -> System.out.println("Ok");
      }
  }

Now
static void testStringJava17(String s) {
        switch (s) {
            case null                   -> System.out.println("Unknown!");
            case "Java 11", "Java 17"   -> System.out.println("LTS");
            default                     -> System.out.println("Ok");
        }
    }




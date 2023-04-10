package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StreamCollectorEx1 {
	
	// Function to convert LinkedList to Array
    public static <T> ArrayList convertLinkedListToArray(LinkedList<T> linkedList)
    {
 
        // Converting LinkedList to Array
        ArrayList<T> array = linkedList.stream().collect(Collectors.toCollection(ArrayList::new));;
 
        return array;
    }

    // Function to convert LinkedList to Array
    public static <T> Object[] convertLinkedListToArray1(LinkedList<T> linkedList)
    {
 
        // Converting LinkedList to Array
        Object[] array = linkedList.toArray();
 
        return array;
    }

	public static void main(String[] args) {

		// Creating linked list
        LinkedList<String>
            linkedList = new LinkedList<String>();
 
        // Adding elements to the linked list
        linkedList.add("G");
        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");
        linkedList.add("s");
 
        // Print the LinkedList
        System.out.println("Linked list: "
                        + linkedList);
 
        // Converting LinkedList to Object Array
        ArrayList objArray = convertLinkedListToArray(linkedList);

		// Print the arraylist
		System.out.println("ArrayList: " + objArray);
		
		// Converting LinkedList to Object Array
        Object[] objArray1 = convertLinkedListToArray1(linkedList);

		// Print the arraylist
		System.out.println("Array: " + Arrays.toString(objArray1));

	}

}

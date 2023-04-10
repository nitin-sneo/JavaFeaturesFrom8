package java8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkToArrayEx1 {
	
	// Function to convert LinkedList to Array
    public static <T> LinkedList convertLinkedListToArray(List<T> linkedList)
    {
 
        // Converting LinkedList to Array
    	LinkedList<T> array = linkedList.stream().collect(Collectors.toCollection(LinkedList::new));;
 
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
        List<String>
            arrayList = new ArrayList<String>();
 
        // Adding elements to the linked list
        arrayList.add("G");
        arrayList.add("e");
        arrayList.add("e");
        arrayList.add("k");
        arrayList.add("s");
 
        // Print the LinkedList
        System.out.println("Linked list: "
                        + arrayList);
 
        // Converting LinkedList to Object Array
        LinkedList linkList = convertLinkedListToArray(arrayList);
        
     // Print the LinkedList
        System.out.println("Link list: "
                        + linkList);

	}

}

package java10;

import java.util.List;
import java.util.stream.Collectors;

public class LocalTypeVar {

	public void explicitTypes() {
        var Roland = new Person("Roland", "Deschain");
        var Susan = new Person("Susan", "Delgado");
        var Eddie = new Person("Eddie", "Dean");
        var Detta = new Person("Detta", "Walker");
        var Jake = new Person("Jake", "Chambers");

        var filteredPersons =
                List.of(Roland, Susan, Eddie, Detta, Jake)
                        .stream()
                        .filter((var x) -> x.getName().contains("a"))
                        .collect(Collectors.toList());
        System.out.println(filteredPersons);
    }
    
    public static void main(String args[]) {
    	//LocalTypeVar varTypeVar = new LocalTypeVar();
    	
    	//Local type inference using var
    	var varTypeVar = new LocalTypeVar();
    	varTypeVar.explicitTypes();
    	
		
	}
}

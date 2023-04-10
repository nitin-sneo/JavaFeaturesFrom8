package com.java11;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAPIEarlier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
	    System.out.println(path);

	    path = Path.of("c:/dev/licenses/windows/readme.txt");
	    System.out.println(path);

	    path = Path.of("c:" , "dev", "licenses", "windows", "readme.txt");
	    System.out.println(path);

	    path = Path.of("c:" , "dev", "licenses", "windows").resolve("readme.txt"); // resolve == getChild()
	    System.out.println(path);

	    try {
			path = Path.of(new URI("file:///c:/dev/licenses/windows/readme.txt"));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(path);

	    // Java < 11 equivalent: Paths.get()
	    path = Paths.get("c:/dev/licenses/windows/readme.txt");
	    System.out.println(path);

	}

}

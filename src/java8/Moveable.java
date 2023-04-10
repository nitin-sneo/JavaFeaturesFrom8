package java8;

public interface Moveable {
	
	default void move(){
        System.out.println("I am moving");
    }


}

interface Walkable extends Moveable
//interface Walkable 
{
	default void move(){
        System.out.println("I am walking");
    }


}

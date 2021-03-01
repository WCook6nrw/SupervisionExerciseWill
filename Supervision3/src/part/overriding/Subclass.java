package part.overriding;

public class Subclass extends Superclass {
	public void method () {
		System.out.println("Subclass method");
		// this overwrites the method from the superclass
	}
}

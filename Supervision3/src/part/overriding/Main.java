package part.overriding;

public class Main {

	public static void main(String[] args) {
		Superclass SuperObj = new Superclass();
		SuperObj.method();
		// this object has the type of "Superclass" so has it's methods
		
		Subclass SubObj = new Subclass();
		SubObj.method();
		// this object has the type of "Subclass" so has it's methods
		
		Superclass obj = new Subclass();
		obj.method();
		// this object has the type of "Superclass" so has it's methods
	}

}

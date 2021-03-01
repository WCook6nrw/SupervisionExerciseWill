package part.abstractclasses;

public class Main {

	public static void main(String[] args) {
		// AbstractClass obj = new AbstractClass(); causes an error
		// you can't instantiate an abstract class
		
		Subclass obj = new Subclass();
		obj.abstract1();
		obj.non_abstract();
		obj.print_attributes();
	}

}

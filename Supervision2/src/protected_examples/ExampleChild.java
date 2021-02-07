package protected_examples;

public class ExampleChild extends ExampleClass {
	public static void main(String[] args) {
		pub();
		// the subclass inherits all the public methods and attributes
		
		// priv(); causes an error
		// the subclass does not inherit private methods and attributes
		
		protect();
		// the subclass inherits all protected methods and attributes
	}
}

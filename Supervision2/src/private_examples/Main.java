package private_examples;

public class Main {

	public static void main(String[] args) {
		// this class has access to the public class "ExampleClass"
		ExampleClass obj = new ExampleClass();
		// an object is created using ExampleClass
		
		obj.pub_function();
		// this method can be accessed, as it is public
		
		// obj.priv_function(); causes an error, as this class doesn't have access to the private methods of "ExampleClass"
		
		obj.calls_private();
		// this method can be accessed, as it is public
	}

}

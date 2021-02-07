package private_examples;

public class ExampleClass {	
	public void pub_function () {
		System.out.println("This is a public method in a public class");
		// this method can be accessed anywhere, as it is public
	}
	private void priv_function () {
		System.out.println("This is a private method in a public class");
		// this method can only be accessed from it's own class, as it is private
	}
	
	public void calls_private () {
		priv_function();
		// the private method can be accessed from within it's own class
	} // this public method allows the private method to be accessed from outside the class
}

package static_examples;

public class Main {
	public static void main(String[] args) {
		ExampleClass.static_function();
		// this static method can be accessed directly, without making an object
		
		// ExampleClass.non_static(); this method is not static, so cannot be accessed from the class
		
		ExampleClass obj = new ExampleClass();
		obj.static_function(); // static methods can be accessed using an object as well
		obj.non_static(); // non-static method can only be accessed using an object
	}
}

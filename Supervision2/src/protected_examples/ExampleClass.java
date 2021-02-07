package protected_examples;

public class ExampleClass {
	public static void main(String[] args) {
		pub();
		priv();
		protect();
		// this class has access to all it's own methods
	}
	
	public static void pub () {
		System.out.println("This is a public method");
	}
	private static void priv () {
		System.out.println("This is a private method");
	}
	protected static void protect () {
		System.out.println("This is a protected method");
	}
}

package part.overloading;

public class Main {

	public static void main(String[] args) {
		OverloadingExample obj = new OverloadingExample();
		obj.method();
		obj.method(1);
		obj.method(1, 2, 3, 4);
		obj.method("Hello");
		obj.method("Hello", "World");
		// different methods are called for each method call above
	}

}

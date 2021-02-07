package static_examples;

public class ExampleClass {
	public void non_static () {
		System.out.println("This is a non-static function");
	}
	
	public static void static_function () {
		System.out.println("This is a static function");
	} // this method is static, so belongs to the class rather than the object
}

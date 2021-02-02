package part.three;

public class SuperClass {
	
	protected int number = 10; 
	
	// all these methods must be public, so they can be accessed from MainClass
	public void function1 () {
		System.out.println("This function is from the superclass");
	}
	public static void function3 () {
		System.out.println("This is a static function");
	}
}

package inheritance;

public class Child extends Parent {
	// this class also has the static int "a" defined (from the superclass)
	static int b = 10;
	
	public static void main (String[] args) {
		/* this class is a subclass of the parent class
		 * this means it has access to the methods and attributes of the parent class as well as its own
		*/
		parent_function();
		child_function();
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void child_function() {
		System.out.println("This function is defined in the child class (subclass)");
	}
}

package inheritance;


public class Parent {
	static int a = 1;
	
	public static void main(String[] args) {
		/* this is the superclass
		this means it does not have the methods and attributes of the subclass
		child_function(); would cause an error as it is not defined
		*/
		parent_function();
		System.out.println(a);
	}
	
	public static void parent_function () {
		System.out.println("This function is defined in the parent class (superclass)");
	}
}

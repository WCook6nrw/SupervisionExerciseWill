package part.three;

public final class SubClass extends SuperClass {
	// no class can inherit from this class, as it has the final keyword
	
	// all these methods must be public, so they can be accessed from MainClass
	public void function2() {
		System.out.println("This function is from the subclass");
	}
	public void function4() {
		System.out.println(number); // the protected "number" can be accessed from subclasses, as well as classes in the same package
	}

}

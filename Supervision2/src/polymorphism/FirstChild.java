package polymorphism;

public class FirstChild extends Parent {
	// function is defined again in this subclass
	// this means it does something different
	public void function() {
		System.out.println("Something different is printed in this child");
	}
}

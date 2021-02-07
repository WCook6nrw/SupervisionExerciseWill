package polymorphism;

public class SecondChild extends Parent {
	// function is defined again in this subclass
	// this means it does something different
	public void function() {
		System.out.println("and in this child");
	}
}

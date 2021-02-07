package polymorphism;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent child1 = new FirstChild();
		Parent child2 = new SecondChild();
		// objects are created using the parent class and each subclass
		
		parent.function();
		child1.function();
		child2.function();
		// despite both subclasses inheriting from parent, each class's function does something different
	}

}

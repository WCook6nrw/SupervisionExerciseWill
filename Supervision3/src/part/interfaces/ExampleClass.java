package part.interfaces;

public class ExampleClass implements Interface {
	public void method1() {
		System.out.println("This method is defined in the subclass");
		// this method must be defined or there will be an error
		
		System.out.println(num);
		// even though num is final, this class still has access to it
	}
}

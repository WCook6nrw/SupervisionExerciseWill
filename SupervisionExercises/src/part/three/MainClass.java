package part.three;

public class MainClass {

	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		
		SuperClass sub = new SubClass();
		SubClass sub2 = new SubClass();
		// this is polymorphism
		
		sup.function1();
		// sup.function2(); causes an error
		sub.function1();
		// sub.function2(); causes an error
		sub2.function1();
		sub2.function2();
		
		SuperClass.function3(); // this function is static, so is part of the class rather than the object
		SubClass.function3();
		
		privateexample();
	}
	
	private static void privateexample() {
		System.out.println("This private method can only be accessed from MainClass");
	}
}

package part.abstractclasses;

public abstract class AbstractClass {
	public int pub_num = 1;
	private int priv_num = 2;
	protected int prot_num = 10;
	// attributes in an abstract class can have any access modifier
	// they can be final and static, but they don't have to be
	
	public abstract void abstract1();
	// this is an abstract method
	// all abstract methods must be defined in the subclass
	
	public void non_abstract() {
		System.out.println("This is a non-abstract method in the abstract class");
		// this method is not abstract, so is defined in this class
	}
}

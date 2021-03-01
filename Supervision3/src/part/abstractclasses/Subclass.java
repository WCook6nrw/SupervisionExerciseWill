package part.abstractclasses;

public class Subclass extends AbstractClass {
	public void abstract1() {
		System.out.println("This abstract method is defined in the subclass");
	}
	public void print_attributes() {
		System.out.println(pub_num);
		// System.out.println(priv_num); causes an error as private attributes are not inherited
		System.out.println(prot_num);
	}
}

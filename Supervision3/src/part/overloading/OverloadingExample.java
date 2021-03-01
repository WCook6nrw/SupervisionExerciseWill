package part.overloading;

public class OverloadingExample {
	public void method() {
		System.out.println("No parameters");
		// This method is called when there are no parameters
	}
	public void method(int x) {
		System.out.print("One int parameter: ");
		System.out.println(x);
		// This method is called when there is one int parameter
	}
	public void method(int... nums) {
		System.out.print("Multiple int parameters: ");
		
		for(int i=0; i<nums.length-1; i++) {
			System.out.print(nums[i]);
			System.out.print(", ");
		}
		System.out.println(nums[nums.length-1]);
		// This method is called when there are multiple int parameters
	}
	public void method(String word) {
		System.out.print("One String parameter: ");
		System.out.println(word);
		// This method is called when there is one String parameter
	}
	public void method(String... words) {
		System.out.print("Multiple String parameters: ");
		
		for(int i=0; i< words.length-1; i++) {
			System.out.print(words[i]);
			System.out.print(", ");
		}
		System.out.println(words[words.length-1]);
		// This method is called when there are multiple int parameters
	}
}

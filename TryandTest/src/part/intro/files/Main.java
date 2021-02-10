package part.intro.files;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		WriteFile writefile = new WriteFile("Test.txt");
		writefile.writeToFile("Hello");
		writefile.writeToFile("Hello");
		
		System.out.println("\n \n \n");
		
		ReadfromFile read = new ReadfromFile("Test.txt");
		LinkedList<String> list = read.readFile();
		for (String item: list) {
			System.out.println(item);
		}
	}

}

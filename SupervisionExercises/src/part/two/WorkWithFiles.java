package part.two;
import java.util.Vector;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WorkWithFiles {
	static String readfile = "src\\part\\two\\File.txt";
	static String writefile = "src\\part\\two\\WriteFile.txt";
	public void readfile() {
		Vector<String> vec = new Vector<String>();
		try {
			File myfile = new File(readfile);
			Scanner myReader = new Scanner(myfile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
				vec.add(data);
			}
			myReader.close();
		}	catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}	finally {
			System.out.println("Done");
		}
	}
	
	public void writefile(Vector<String> vec) {
		try {
			FileWriter writer = new FileWriter(writefile);
			for(String element:vec) 
					writer.write(element);
			writer.close();
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}


package part.intro.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class WorkWithFiles {
	public Vector<String> readFile(String fileName) {
		Vector<String> fileLines = new Vector<String>();
		
		// tries to read from the file
		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader buffreader = new BufferedReader(reader);
			
			while(true) {
				String line = buffreader.readLine();
				if(line==null)
					break;
				else
					fileLines.add(line);
			}   
			buffreader.close();
		}
		
		// handles errors if file reading fails
		catch(IOException e) {
			System.out.println("Error : "+e.getMessage());  
		}
		
		return fileLines;
	}

	public void writeToFile(String fileName, Vector<String> myVectorOfStrings)
	{		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// true - append content to the end of a file.
			// false - create new file.
			fw = new FileWriter(fileName, false);
			bw = new BufferedWriter(fw);
			
			// writes the content to a buffer
			for (String line:myVectorOfStrings)
			{
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}
		
	}

}

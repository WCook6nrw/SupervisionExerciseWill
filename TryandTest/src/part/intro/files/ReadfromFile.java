package part.intro.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;

public class ReadfromFile extends FileOperations {
	// constructors
	public ReadfromFile(String folder, String file) {
		super(folder, file);
	}
	
	public ReadfromFile(String file) {
		super(file);
	}
	
	public ReadfromFile() {
		super();
	}
	
	// Read already set file name
	public LinkedList<String> readFile () throws IOException {
		return readFile(0 ,-1);
	}
	
	// read a certain number of lines
	// for -1 read all
	public LinkedList<String> readFile(long startFromLine, int numberOfLines) throws IOException {
		if ((numberOfLines<-1) || (numberOfLines == 0))
			return null;
		
		FileReader fileReader = new FileReader(this.getTextFolderName()+"/"+this.getTextFileName());
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		LinkedList<String> lines = new LinkedList<String>();
		String line = null;
		
		long readLineCounter = 0;
		
		while ((line = bufferedReader.readLine()) != null) {
			// if it needs to start from a specific line
			if (readLineCounter<startFromLine) {
				readLineCounter++;
				continue;
			}
			
			lines.add(line);
			numberOfLines--;
			
			if (numberOfLines == 0) 
				break;
			
			// handling the first read
			if (startFromLine != 0)
				readLineCounter++;
		}
		bufferedReader.close();
		
		return lines;
	}
	
	public static LinkedList<String> readFile(String path, Charset encoding) throws IOException {
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		LinkedList<String> lines = new LinkedList<String>();
		String line = null;
		while ((line = bufferedReader.readLine())!= null) {
			lines.add(line);
		}
		bufferedReader.close();
		return lines;
	}
	
	public long getNumberOfLines() throws IOException {
		long lineCounter = 0;
		
		String delimiter;
		if(this.getTextFolderName().length()>0) {
			delimiter = "/";
		} else {delimiter = "";}
		
		FileReader fileReader = new FileReader(this.getTextFolderName()+delimiter+this.getTextFileName());
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while ((bufferedReader.readLine() != null)) {
			lineCounter++;
		}
		bufferedReader.close();
		
		return lineCounter;
	}
}

package part.intro.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class WriteFile extends FileOperations {
	private BufferedWriter bw;
	// In case of very long files, first write to temporary buffer and then call a method to write to file.
	private BufferedWriter bwTemp;
	private boolean useBufferedWriter;
	private FileWriter fw;
	private boolean printInConsoleEveryFileLine;
	
	// ---------------------------------------------------------------------- //
	// Constructors
	// ---------------------------------------------------------------------- //
	// Default folder - temp
	// @param fileName
	public WriteFile(String fileName)
	{
		super("temp", fileName);
		//textFolderName = "temp";
		boolean success = (new File(this.getTextFolderName())).mkdirs();
		if (!success) {
		    // Directory creation failed
		}
		
		//textFileName = fileName;
		//fileName = folderName+"//"+textFileName;
		createFile(fileName);
	}
	
	/**
	 * If want to specify folder name manually.
	 * @param folderName
	 * @param fileName
	 */
	public WriteFile(String folderName, String fileName)
	{
		super(folderName, fileName);
		boolean success = (new File(folderName)).mkdirs();
		if (!success) {
		    // Directory creation failed
		}

		//fileName = folderName+"//"+textFileName;
		createFile(fileName);
	}
	
	/**
	 * Used for dividing files.
	 * Attention! Do not use this constructor for creating/writing to a file.
	 */
	public WriteFile() {
		super();
	}
	// ---------------------------------------------------------------------- //

	private void createFile(String fileName)
	{
		PrintWriter writer;
		try {
			writer = new PrintWriter(this.getTextFolderName()+"/"+fileName);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		printInConsoleEveryFileLine = true;
		System.out.println("Create file: "+this.getTextFolderName()+"/"+fileName+".");
		try {
			fw = new FileWriter(this.getTextFolderName()+"/"+this.getTextFileName(), true);
			bwTemp = new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		useBufferedWriter = false;
	}
		
	// Open created file.
	// Write to the file directly.
	// Close the file.
	// @param content - content to write to a file.
	public void writeToFile(String content)
	{
		if(this.useBufferedWriter)
		{
			this.writeToTempBuffer(content);
			return;
		}
		try {
			fw = new FileWriter(this.getTextFolderName()+"/"+this.getTextFileName(), true);
			// true - append content to the end of a file.
			bw = new BufferedWriter(fw);
			bw.write(content);
			bw.newLine();

			//System.out.println("Done");
			if(this.printInConsoleEveryFileLine)
				System.out.println(content);

		} catch (IOException e) {

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
	
	// Keep the file open.
	// Write the content of the buffer in the file.
	// @param content
	public void writeTempBufferToFile()
	{
		try {
			if (bwTemp != null)
				bwTemp.close();
			if (fw != null)
				fw.close();
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	// Return the file names of resulting files. Format: textFileName+tmp+divisionNumber.
	public LinkedList<String> divideIntoTempFilesBySize(String folder, String file, double maxFileSizeMB) throws IOException
	{
		// Resulting temporary files.
		LinkedList<String> createdTemoporaryFiles = new LinkedList<String>();
		
		// Number of created temporary files.
		int tempFilesNumber = 0;
		
		// Write maxFileSizeMB*100 lines and check the size.
		int maxlines = (int) (100*maxFileSizeMB);
		
		// Counter of already read lines.
		long readLinesCounter = 0;
		
		// Create a file reader.
		ReadfromFile readFromFile = new ReadfromFile(folder, file);
		
		// Get certain number of temp lines.
		LinkedList<String> tempLines = readFromFile.readFile(readLinesCounter, maxlines);
		
		// Remove txt extension, only to re-added it.
		String tempFileName = file.substring(0, file.lastIndexOf('.'))+"_temp_"+tempFilesNumber+".txt";
		
		// Create a file writer.
		WriteFile writeFile = new WriteFile(folder, tempFileName);
		
		writeFile.setPrintInConsoleEveryFileLine(false);
		
		while(tempLines.size()>0)
		{
			// Write to file's buffer.
			for(String line:tempLines)
			{
				writeFile.writeToFile(line);
			}
			
			// Check if file has reached max size.
			// If yes, start a new file.
			if(writeFile.getFileSizeMB()>maxFileSizeMB)
			{
				tempFilesNumber++;
				tempFileName = file.substring(0, file.lastIndexOf('.'))+"_temp_"+tempFilesNumber+".txt";
				createdTemoporaryFiles.add(tempFileName);
				
				writeFile = new WriteFile(folder, tempFileName);
				
				writeFile.setPrintInConsoleEveryFileLine(false);
			}
			
			// Next start.
			readLinesCounter = readLinesCounter+tempLines.size();

			// Get certain number of temp lines.
			tempLines = readFromFile.readFile(readLinesCounter, maxlines);			
		}
		
		return createdTemoporaryFiles;
	}
	
	public void writeToTempBuffer(String content)
	{
		try {
			bwTemp.write(content);
			bwTemp.newLine();
			//System.out.println("Done");
			if(this.printInConsoleEveryFileLine)
				System.out.println(content);
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public boolean isPrintInConsoleEveryFileLine() {
		return printInConsoleEveryFileLine;
	}

	public void setPrintInConsoleEveryFileLine(boolean printInConsoleEveryFileLine) {
		this.printInConsoleEveryFileLine = printInConsoleEveryFileLine;
	}

	public boolean isUseBufferedWriter() {
		return useBufferedWriter;
	}

	public void setUseBufferedWriter(boolean useBufferedWriter) {
		this.useBufferedWriter = useBufferedWriter;
	}
}

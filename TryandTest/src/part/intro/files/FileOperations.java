package part.intro.files;

import java.io.File;

public class FileOperations {
	private String textFileName;
	private String textFolderName;
	
	// constructors
	public FileOperations(String folder, String file) {
		textFolderName = folder;
		textFileName = file;
	}
	
	public FileOperations(String file) {
		textFileName = file;
	}
	
	public FileOperations() {}
	
	public String getTextFolderName() {
		return textFileName;
	}
	
	public String getTextFileName() {
		return textFileName;
	}
		
	public double getFileSizeMB() {
		return (getFileSizeB() / (1024*1024));
	}
	
	public double getFileSizeKB() {
		return (getFileSizeB()/1024);
	}
	
	public double getFileSizeB() {
		File file = new File(textFolderName+"\\"+textFileName);
		if (!file.exists() || !file.isFile()) return -1;
		return file.length();
	}
}
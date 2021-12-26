package employeepayrolloperations;

import java.io.File;
import java.io.IOException;

enum EFileNames{
	FILE_NAME1("File1.txt"),
	FILE_NAME2("File2.txt"),
	FILE_NAME3("File3.txt"),
	FILE_NAME4("File4.txt"),
	FILE_NAME5("File5.txt");
	
	
	final String fileName;
	
	private EFileNames(String fileName) {
		this.fileName = fileName;
	}
	
	public String getConstant() {
		return fileName;
	}
}

public class EmployeePayrollService {
	
	static File file1 = new File(EFileNames.FILE_NAME1.getConstant());
	static File file2 = new File(EFileNames.FILE_NAME2.getConstant());
	static File file3 = new File(EFileNames.FILE_NAME3.getConstant());
	static File file4 = new File(EFileNames.FILE_NAME4.getConstant());
	static File file5 = new File(EFileNames.FILE_NAME5.getConstant());
	
	//Create new file
	public static void createNewFile() {
		
		//Create new file and File exists.
		try {
			if(file1.createNewFile() && file2.createNewFile() &&
					file3.createNewFile() && file4.createNewFile() &&
					file5.createNewFile()) {
				System.out.println("New file is created");
			}else {
				System.out.println("File is already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Delete files and File not exist
	public static void deleteFile() {
		
		if(file5.delete()) {
			System.out.println("File is deleted.");
		}else {
			System.out.println("File not found!.");
		}
	}
	
	//Create New Directory
	public static void createDirectory() {
		File directory = new File("D:/Eclipse Java Projects/eclipse-workspace/Java_IO_Programs/Ashok");
		if(directory.mkdir()) {
			System.out.println("The new directory is created.");
		}else {
			System.out.println("The directory already exists.");
		}
	}
	
	public static void main(String[] args) {
		createNewFile();
		deleteFile();
		createDirectory();
	}

}

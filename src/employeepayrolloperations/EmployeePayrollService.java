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
	
	//Create new file
	public static void createNewFile() {
		File file1 = new File(EFileNames.FILE_NAME1.getConstant());
		File file2 = new File(EFileNames.FILE_NAME2.getConstant());
		File file3 = new File(EFileNames.FILE_NAME3.getConstant());
		File file4 = new File(EFileNames.FILE_NAME4.getConstant());
		File file5 = new File(EFileNames.FILE_NAME5.getConstant());
		
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
	
	public static void main(String[] args) {
		createNewFile();
	}

}

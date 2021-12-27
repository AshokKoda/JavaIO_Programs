package payrollservice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum EFileNames{
	Text_FILE_NAME("payroll.txt");
	
	final String fileName;
	
	private EFileNames(String fileName) {
		this.fileName = fileName;
	}
	
	public String getConstant() {
		return fileName;
	}
}

public class EmployeePayrollService { 
	
	public static void main(String[] args) {

		File textfile = new File(EFileNames.Text_FILE_NAME.getConstant());
		try {
			if(textfile.createNewFile()) {
				System.out.println("New File is created...");
			}
			else {
				System.out.println("File Already Found!");
			}
			writeTextFile(textfile, getListOfPayroll().toString());
			totalCount();
			readTextFile(textfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Payroll> getListOfPayroll(){
		List<Payroll> payRoll = new ArrayList<Payroll>();
		payRoll.add(new Payroll(1, "Ashok", 10000));
		payRoll.add(new Payroll(2, "Harish", 15000));
		payRoll.add(new Payroll(3, "Trinadh", 18000));
		payRoll.add(new Payroll(4, "Pandu", 20000));
		return payRoll;
	}
	
	
	public static void writeTextFile(File file, String data) {
		try {
			FileWriter fileWrite = new FileWriter(file);
			fileWrite.write(data);
			fileWrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static long totalCount() {
		long count = 0;
		try {
			File textfile = new File(EFileNames.Text_FILE_NAME.getConstant());
			//create an object of Scanner
			//associated with the file
			Scanner sc = new Scanner(textfile);
			//read each line and
			//count number of lines
			while(sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
			System.out.println("Count = " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public static void readTextFile(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			Scanner sc = new Scanner(fileReader);
			
			System.out.println("Reading data ::");
			System.out.println(sc.nextLine());
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/**
* @author Daniel Pan
* CECS277 Lab Assignment#3
* Tester class for Payroll program
*/
import java.io.*;
import java.nio.file.Files;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class PayrollFileReader {
	
	/**
	 * static variables
	 */
	public static int employeeCount;
	
	/**
	 * Reads and creates a staff object
	 * @param file - File
	 * @param Employee[] - myEmployee
	 */
	public static void readStaff(File file, Employee[] myEmployee) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			while (line != null) {
				StringTokenizer t = new StringTokenizer(line, "\t");
				String lName = t.nextToken();
				String fName = t.nextToken();
				String idNumber = t.nextToken();
				String sex = t.nextToken();
				int month = Integer.parseInt(t.nextToken());
				int day = Integer.parseInt(t.nextToken());
				int year = Integer.parseInt(t.nextToken());
				int hourlyRate = Integer.parseInt(t.nextToken());
				myEmployee[employeeCount] = new Staff(lName, fName, idNumber, sex, month, day, year, hourlyRate);
				employeeCount++;
				line = in.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Reads and creates a faculty object
	 * @param file - File
	 * @param Employee[] - myEmployee
	 */
	public static void readFaculty(File file, Employee[] myEmployee) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			while (line != null) {
				StringTokenizer t = new StringTokenizer(line, "\t");
				String lName = t.nextToken();
				String fName = t.nextToken();
				String idNumber = t.nextToken();
				String sex = t.nextToken();
				int month = Integer.parseInt(t.nextToken());
				int day = Integer.parseInt(t.nextToken());
				int year = Integer.parseInt(t.nextToken());
				Faculty.Level level = Faculty.Level.getLevelByDescription(t.nextToken());
				String degree = t.nextToken();
				String major = t.nextToken();
				String research = t.nextToken();
				myEmployee[employeeCount] = new Faculty(lName, fName, idNumber, sex, month, day, year, level, degree, major, research);
				employeeCount++;
				line = in.readLine();
			}
		}	
		catch (IOException e) {
			System.out.println(e.getMessage());
		} 	
	}

	/**
	 * Reads and creates a partTime object
	 * @param file - File
	 * @param Employee[] - myEmployee
	 */
	public static void readPartTime(File file, Employee[] myEmployee) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			while (line != null) {
				StringTokenizer t = new StringTokenizer(line, "\t");
				String lName = t.nextToken();
				String fName = t.nextToken();
				String idNumber = t.nextToken();
				String sex = t.nextToken();
				int month = Integer.parseInt(t.nextToken());
				int day = Integer.parseInt(t.nextToken());
				int year = Integer.parseInt(t.nextToken());
				int hourlyRate = Integer.parseInt(t.nextToken());
				int hoursWorkedPerWeek = Integer.parseInt(t.nextToken());
				myEmployee[employeeCount] = new PartTime(lName, fName, idNumber, sex, month, day, year, hourlyRate, hoursWorkedPerWeek);
				employeeCount++;
				line = in.readLine();
			}
		}
		catch (IOException e)  {
			System.out.println(e.getMessage());
		}
	}
}
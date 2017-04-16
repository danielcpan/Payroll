/**
* @author Daniel Pan
* CECS277 Lab Assignment#3
* Tester class for Payroll program
*/
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class PayrollTester {
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		boolean end = false;

		Employee[] myEmployee = new Employee[9];
		File staffFile = new File("Staff.txt");
		File facultyFile = new File("Faculty.txt");
		File partTimeFile = new File("PartTime.txt");
		PayrollFileReader.readStaff(staffFile, myEmployee);
		PayrollFileReader.readFaculty(facultyFile, myEmployee);
		PayrollFileReader.readPartTime(partTimeFile, myEmployee);
		// myEmployee[0] = new Staff("Allen", "Paita", "123", "M", 2, 23, 59, 50);
		// myEmployee[1] = new Staff("Zapata", "Steven", "456", "F", 7, 12, 64, 35);
		// myEmployee[2] = new Staff("Rios", "Enrique", "789", "M", 6, 2, 70, 40);
		// myEmployee[3] = new Faculty("Johnson", "Anne", "243", "F", 4, 27, 62, Faculty.Level.FU, "PH.D", "Engineering", "3");
		// myEmployee[4] = new Faculty("Bouris", "William", "791", "F", 3, 14, 75, Faculty.Level.AO, "PH.D", "English", "1");
		// myEmployee[5] = new Faculty("Andrade", "Christopher", "623", "F", 5, 22, 80, Faculty.Level.AS, "MS", "Physical Education", "0");
		// myEmployee[6] = new PartTime("Guzman", "Augusto", "455", "F", 8, 10, 77, 35, 30);
		// myEmployee[7] = new PartTime("Depirro", "Martin", "678", "F", 9, 15, 87, 30, 15);
		// myEmployee[8] = new PartTime("Aldaco", "Marque", "945", "M", 11, 24, 88, 20, 35);
		while (end == false) {
			displayMenu();
			int userInput = scan.nextInt();
			switch(userInput) {
				case 1:
					// for (int i = 0; i < myEmployee.length; i++) {
					// 	if (myEmployee[i] instanceof Staff && myEmployee[i] instanceof PartTime == false) {
					// 		System.out.println(myEmployee[i].toString() + "\n");
					// 	}
					// }
					for (int i = 0; i < myEmployee.length; i++) {
						System.out.println(myEmployee[i].toString() + "\n");
					}
					break;
				case 2:
					double totalMonthlySalary = 0;
					for (int i = 0; i < myEmployee.length; i++) {
						if (myEmployee[i] instanceof PartTime) {
							totalMonthlySalary += ((PartTime)myEmployee[i]).monthlyEarning();
						}
					}
					System.out.println("Total Monthly Salary for All Part-Time Employees: " + totalMonthlySalary);
					break;
				case 3: 
					totalMonthlySalary = 0;
					for (int i = 0; i < myEmployee.length; i++) {
						totalMonthlySalary += myEmployee[i].monthlyEarning();
					}
					System.out.println("Total Monthly Salary for All Employees: " + totalMonthlySalary);
					break;
				case 4:
					Arrays.sort(myEmployee);
					for (int i = 0; i < myEmployee.length; i++) {
						System.out.println(myEmployee[i].toString() + "\n");
					}
					break;
				case 5:
					Arrays.sort(myEmployee, Employee.lastNameAscending);
					for (int i = 0; i < myEmployee.length; i++) {
						System.out.println(myEmployee[i].toString() + "\n");
					}
					break;
				case 6:
					boolean end2 = false;
					System.out.println("Cloning Employee[3]");
					Faculty duplicate = (Faculty) ((Faculty) myEmployee[3]).clone();
					while (end2 == false) {
						displayOption6();
						int userInput2 = scan.nextInt();
						switch(userInput2) {
							case 1:
								System.out.println("Original: \n" + myEmployee[3] + "\n");
								break;
							case 2:
								System.out.println("Duplicate: \n" + duplicate + "\n");
								break;
							case 3:
								System.out.println("Enter new first name for original: ");
								String newName = scan.next();
								myEmployee[3].setFirstName(newName);
								break;
							case 4:
								System.out.println("Enter new first name for duplicate: ");
								String newDuplicateName = scan.next();
								duplicate.setFirstName(newDuplicateName);
								break;
							case 5:
								end2 = true;
								break;
						}
					}
					break;
				case 7: 
					end = true;
					break;
				default:
					break;
			}
		}
	}

	public static void displayMenu() {
		System.out.println("1. Display All Employee Information");
		System.out.println("2. Display Total Monthly Salary For All Part-Time Staff");
		System.out.println("3. Display Total Monthly Salary For All Employees");
		System.out.println("4. Display All Employee Information Descending Order By ID");
		System.out.println("5. Display All Employee Information Ascending Order by Last Name");
		System.out.println("6. Duplicate Faculty Object");
		System.out.println("7. Exit");
	}

	public static void displayOption6() {
		System.out.println("1. Display Original");
		System.out.println("2. Display Duplicate");
		System.out.println("3. Modify Orignal First Name");
		System.out.println("4. Modify Duplicate First Name");
		System.out.println("5. Exit");
	}
}
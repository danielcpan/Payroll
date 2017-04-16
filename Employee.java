/**
* @author Daniel Pan
* CECS277 Lab Assignment#2
* Simulates an Employee object
*/
import java.util.Calendar;
import java.util.Comparator;

public abstract class Employee implements Comparable<Object>, Comparator<Employee> {
	/*****INSTANCE VARIABLES*****/
	String lastName;
	String firstName;
	String idNumber;
	String sex;
	Calendar birthDate;
	
	/**
	 * default contructor
	 */
	public Employee() {

	}

	/**
	 * loaded constructor
	 * @param lastName - String
	 * @param firstName - String
	 * @param idNumber - String
	 * @param sex - String
	 * @param month - int
	 * @param day - int
	 * @param year - int
	 */
	public Employee(String lastName, String firstName, String idNumber, String sex, int month, int day, int year) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setIDNumber(idNumber);
		this.setSex(sex);
		this.setBirthDate(month, day, year);
	}

	/**
	 * @return String - idNumber, firstName, lastName, birthdate concatenated
	 */
	public String toString() {
		return "ID Employee number: " + this.idNumber 
		+ "\nEmployee name: " + this.firstName + " " + this.lastName 
		+ "\nBirth Date: " + this.getBirthDate();
	}

	/**
	 * sets this.lastName
	 * @param lastName - String
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return String lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * sets this.firstName
	 * @param firstName - String
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return String firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * sets this.idNumber
	 * @param idNumber - String
	 */
	public void setIDNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return String idNumber
	 */
	public String getIDNumber() {
		return this.idNumber;
	}

	/**
	 * sets this.sex
	 * @param sex - String
	 */
	public void setSex(String sex) {
		this.sex = sex;
	} 

	/**
	 * @return String sex
	 */
	public String getSex() {
		return this.sex;
	}

	/**
	 * sets this.birthDate
	 * @param month - int
	 * @param day - int
	 * @param year - int
	 */
	public void setBirthDate(int month, int day, int year) {
		this.birthDate = Calendar.getInstance();
		this.birthDate.set(Calendar.MONTH, month);
		this.birthDate.set(Calendar.DAY_OF_MONTH, day);
		this.birthDate.set(Calendar.YEAR, year);
	}

	/**
	 * @return String - month, day, year concatenated
	 */
	public String getBirthDate() {
		return this.birthDate.get(Calendar.MONTH) + "/" + this.birthDate.get(Calendar.DAY_OF_MONTH) + "/" + this.birthDate.get(Calendar.YEAR);
	}

	/**
	 * @return String lastName
	 * 
	 */
	public abstract double monthlyEarning();

	/**
	 * @return employee array in descending order by idNumber
	 */
	public int compareTo(Object data) {
		Employee other = (Employee) data;
		return other.idNumber.compareTo(this.idNumber);
	}

	/**
	 * static method call for comparing employee objects and returning them in a last name ascending order
	 */
	public static Comparator<Employee> lastNameAscending = new Comparator<Employee>() {
		
		/**
		 * @return employee array in ascending order
		 */
		public int compare(Employee object1, Employee object2) {
			return object1.lastName.compareTo(object2.lastName);
		}
	};
}
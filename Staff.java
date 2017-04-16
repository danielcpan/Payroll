/**
* @author Daniel Pan
* CECS277 Lab Assignment#2
* Simulates Staff, a subclass from the inherited Employee class
*/
public class Staff extends Employee {
	/*****INSTANCE VARIABLES*****/
	int hourlyRate;

	/**
	 * default constructor
	 */
	public Staff() {

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
	public Staff(String lastName, String firstName, String idNumber, String sex, int month, int day, int year, int hourlyRate) {
		super(lastName, firstName, idNumber, sex, month, day, year);
		this.setHourlyRate(hourlyRate);
	}

	/**
	 * sets this.hourlyRate
	 * @param hourlyRate - int
	 */
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return int hourlyRate
	 */
	public int getHourlyRate() {
		return this.hourlyRate;
	}

	/**
	 * @return monthly earning
	 */
	public double monthlyEarning() {
		return hourlyRate * 160;
	}

	/**
	 * @return String - idNumber, firstName, lastName, birthdate, monthlyEarning concatenated
	 */
	public String toString() {
		return "ID Employee number: " + this.idNumber 
		+ "\nEmployee name: " + this.firstName + " " + this.lastName 
		+ "\nBirth Date: " + this.getBirthDate()
		+ "\nFull Time" 
		+ "\nMonthly Salary: " + this.monthlyEarning();
	}

	public int compare(Employee o1, Employee o2) {
		return 0;
	}
}
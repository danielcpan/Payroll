/**
* @author Daniel Pan
* CECS277 Lab Assignment#2
* Simulates PartTime employee, a subclass from the inherited Staff class
*/
public class PartTime extends Staff {
	/*****INSTANCE VARIABLES*****/
	int hoursWorkedPerWeek;

	/**
	 * default contructor
	 */
	public PartTime() {

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
	public PartTime(String lastName, String firstName, String idNumber, String sex, int month, int day, int year, int hourlyRate, int hoursWorkedPerWeek) {
		super(lastName, firstName, idNumber, sex, month, day, year, hourlyRate);
		this.setHoursWorkedPerWeek(hoursWorkedPerWeek);
	}

	/**
	 * sets this.hoursWorkedPerWeek
	 * @param hoursWorkedPerWeek - int
	 */
	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}

	/**
	 * @return int hoursWorkedPerWeek
	 */
	public int getHoursWorkedPerWeek() {
		return this.hoursWorkedPerWeek;
	}

	/**
	 * @return monthly earning
	 */
	public double monthlyEarning() {
		return this.hourlyRate * this.hoursWorkedPerWeek * 4;
	}

	/**
	 * @return String - idNumber, firstName, lastName, birthdate, hoursWorkedPerWeek, monthlyEarning concatenated
	 */
	public String toString() {
		return "ID Employee number: " + this.idNumber 
		+ "\nEmployee name: " + this.firstName + " " + this.lastName 
		+ "\nBirth Date: " + this.getBirthDate()
		+ "\nHours worked per week: " + this.hoursWorkedPerWeek 
		+ "\nMonthly Salary: " + this.monthlyEarning();
	}
}
 /**
* @author Daniel Pan
* CECS277 Lab Assignment#2
* Simulates Faculty, a subclass from the inherited Employee class
*/
public class Faculty extends Employee implements Cloneable{
	/*****INSTANCE VARIABLES*****/
	Level level;
	Education myEducation;

	/**
	 * Enum
	 */
	public enum Level {
		AS("Assistant Professor"),
		AO("Associate Professor"),
		FU("Professor");

		/*****INSTANCE VARIABLES*****/
		private String description;

		/**
		 * Contructor
		 * @param description - String
		 */
		private Level(String description) {
			this.setLevelDescription(description);
		}

		/**
		 * sets this.description
		 * @param description - String
		 */
		public void setLevelDescription(String description) {
			this.description = description;
		}

		/**
		 * @return String description
		 */
		public String getLevelDescription() {
			return this.description;
		}

		public static Level getLevelByDescription(String description) {
			if (description.equals("Assistant Professor")) {
				return AS;
			}
			else if (description.equals("Associate Professor")) {
				return AO;
			}
			else {
				return FU;
			}
		}
	}

	/**
	 * default contructor
	 */
	public Faculty() {
	
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
	public Faculty(String lastName, String firstName, String idNumber, String sex, int month, int day, int year, Level level, String degree, String major, String research) {
		super(lastName, firstName, idNumber, sex, month, day, year);
		this.setLevel(level);
		this.myEducation = new Education();
		this.myEducation.setDegree(degree);
		this.myEducation.setMajor(major);
		this.myEducation.setResearch(research);
	}

	/**
	 * sets this.level
	 * @param level - Level
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * @return Level level
	 */
	public Level getLevel() {
		return this.level;
	}

	/**
	 * @return monthly earning
	 */
	public double monthlyEarning() {
		if (this.level == Level.AS) {
			return EmployeeInfo.FACULTY_MONTHLY_SALARY;
		}
		else if (this.level == Level.AO) {
			return EmployeeInfo.FACULTY_MONTHLY_SALARY * 1.5;
		}
		else {
			return EmployeeInfo.FACULTY_MONTHLY_SALARY * 2.0;
		}
	}

	/**
	 * @return duplicate - Faculty
	 */
	public Object clone() throws CloneNotSupportedException {
		Faculty duplicate = (Faculty) super.clone();
		return duplicate;
	}

	/**
	 * @return String - idNumber, firstName, lastName, birthdate, level, monthlyEarning concatenated
	 */
	public String toString() {
		return "ID Employee number: " + this.idNumber 
		+ "\nEmployee name: " + this.firstName + " " + this.lastName 
		+ "\nBrith Date: " + this.getBirthDate() 
		+ "\n" + this.level.getLevelDescription()
		+ "\nMonthly Salary: " + this.monthlyEarning();
	}

	public int compare(Employee o1, Employee o2) {
		return 0;
	}
}
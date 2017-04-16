/**
 * @author Daniel Pan
 * CECS277 Lab Assignment#2
 * Simulates the education for every employee object
 */
public class Education {
	/*****INSTANCE VARIABLES*****/
	String degree;
	String major;
	String research;

	/**
	 * default constructor
	 */
	public Education() {

	}

	/**
	 * sets this.degree
	 * @param degree - String
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return String degree
	 */
	public String getDegree() {
		return this.degree;
	}

	/**
	 * sets this.major
	 * @param major - String
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return String major
	 */
	public String getMajor() {
		return this.major;
	}

	/**
	 * sets this.research
	 * @param research - String
	 */
	public void setResearch(String research) {
		this.research = research;
	}

	/**
	 * @return String research
	 */
	public String getResearch() {
		return this.research;
	}
}
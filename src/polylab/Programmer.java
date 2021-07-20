
package polylab;

import java.util.Calendar;

//Programmer abstract superclass.

public abstract class Programmer {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final Date birthDate;

//constructor
	public Programmer(String firstName, String lastName, String socialSecurityNumber, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = new Date(month, year);
	}

//return first name

//TO DO: INSERT YOUR CODE HERE
	public String getFirstName() {
		return firstName;
	}
	//return last name
	public String getLastName() {
		return lastName;
	}
	//TO DO: INSERT YOUR CODE HERE 

	//return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

//TO DO: INSERT YOUR CODE HERE
//return birth date  // 
	public Date getDate() {
		return this.birthDate;
	}
//TO DO: INSERT YOUR CODE HERE

//return String representation of Programmer object
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), "social security number",
				getSocialSecurityNumber(), "birth month and year", this.birthDate.toString());
	}

	/** abstract method must be overridden by concrete subclasses */

	public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? */
}

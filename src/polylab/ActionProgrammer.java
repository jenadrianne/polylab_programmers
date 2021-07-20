
package polylab;

public class ActionProgrammer extends Programmer {
private double wage; // wage per hour
private double pieces; // pieces created per week

//constructor
public ActionProgrammer(String firstName, String lastName,
String socialSecurityNumber, int month, int year, 
double wage, double pieces) {
super(firstName, lastName, socialSecurityNumber, month, year);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((pieces < 0.0) || (pieces > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.pieces = pieces;
} 

//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

//return wage
public double getWage() {
return wage;
} 



public double getPieces() {
	return pieces;
}

public void setPieces(double pieces) {
	this.pieces = pieces;
}

//calculate earnings; override abstract method earnings in Programmer
@Override                                                           
public double earnings() {                                            
	 return getWage() * getPieces();   
}                                          

//return String representation of HourlyProgrammer object              

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
@Override                                                             
public String toString() { 
	return String.format("Action programmer: %s%n%s: $%,.2f; %s: %,.2f",
			super.toString(), "hourly wage", getWage(), 
			"pieces worked", getPieces()); }
//END

                     
}


//********************************************************************
//  Employee.java       Java Foundations
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate, String eClass, double eTotalHolidayPay)
    {
        super(eName, eAddress, ePhone, eClass, eTotalHolidayPay);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
        classification = eClass;
        totalHolidayPay = eTotalHolidayPay;

    }

    //-----------------------------------------------------------------
    //  Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;
        result += "\nClassification = " + classification;
        result += "\ntotal Holiday Pay: " + totalHolidayPay;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay()
    {

        if (classification.equals("Full-time")) {
            totalHolidayPay = payRate * 5;

        } else if (classification.equals("Part-time")) {
            totalHolidayPay = payRate * 3;
        }

        return totalHolidayPay;
    }

}
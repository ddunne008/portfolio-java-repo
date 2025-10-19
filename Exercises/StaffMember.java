//********************************************************************
//  StaffMember.java       Java Foundations
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;
    protected String classification;
    protected double totalHolidayPay;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone, String eClass, double eTotalHolidayPay)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
        classification = eClass;
        totalHolidayPay = eTotalHolidayPay;

    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";
        result += "Class: " + classification + "\n";
        result += "Total Holiday Pay: " + totalHolidayPay;

        return result;
    }

    public String getName() {
        return name;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public abstract double pay();
}
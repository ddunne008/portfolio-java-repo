public class Hospital {

    String name;
    int employeeNo;
    String jobRole;
    String specialty;
    String department;
    int patientCount;
    Boolean isIntern;

    // Nurse constructor
    public Hospital(String name, int employeeNo, int patientsCount, Boolean isIntern) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.jobRole = "Nurse";
        this.patientCount = patientsCount;
        this.specialty = "n/a";
        this.isIntern = isIntern;

    }
    // Doctor constructor
    public Hospital(String name, int employeeNo, Boolean isIntern) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.jobRole = "Doctor";
        this.patientCount = 0;
        this.specialty = "n/a";
        this.isIntern = isIntern;

    }
    // Cleaner constructor
    public Hospital(String name, int employeeNo, String department) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.jobRole = "Cleaner";
        this.specialty = "n/a";
        this.department = department;
        this.patientCount = 0;

    }
    // Receptionist constructor
    public Hospital(String name, int employeeNo, String department, Boolean isIntern) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.jobRole = "Receptionist";
        this.specialty = "n/a";
        this.department = department;
        this.patientCount = 0;
        this.isIntern = isIntern;

    }

    public void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee No : " + employeeNo);
        System.out.println("Job Role : " + jobRole);
        System.out.println("Specialty : " + specialty);
        if (jobRole.equals("Nurse")) {
            System.out.println("Patients assigned : " + patientCount);
        }
        if (jobRole.equals("Doctor")) {
            System.out.println("Is Intern : " + isIntern);
        }
        if (jobRole.equals("Nurse")) {
            System.out.println("Is Intern : " + isIntern);
        }

        System.out.println("********************************");
    }
}
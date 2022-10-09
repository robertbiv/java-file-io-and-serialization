//Robert Bennethum
public class SalariedEmployee {

    //fields of the class
    private String firstName ;
    private String lastName ;
    private String hireDate ;
    private double salary ;

    //constructors of the class
    public SalariedEmployee() {

    }

    public SalariedEmployee(String firstName, String lastName, String hireDate, double salary) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    // getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//for printing
    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + ", hireDate=" + hireDate + ", salary=" + salary;
    }
    @Override
    //check if the same
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SalariedEmployee other = (SalariedEmployee) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (hireDate == null) {
            if (other.hireDate != null)
                return false;
        } else if (!hireDate.equals(other.hireDate))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }





}
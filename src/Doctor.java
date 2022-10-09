//Robert Bennethum
public class Doctor extends SalariedEmployee {

    private String speciality ;

    public Doctor() {
        super();

    }
    //set doctor
    public Doctor(String firstName, String lastName, String hireDate, double salary) {
        super(firstName, lastName, hireDate, salary);

    }
    public Doctor(String firstName, String lastName, String hireDate, double salary, String speciality) {
        super(firstName, lastName, hireDate, salary);
        this.speciality = speciality;
    }
    //specialty
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    @Override
    //for printing
    public String toString() {
        return super.toString() + ", Doctor speciality=" + speciality;
    }
    @Override
    //see if the same
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Doctor other = (Doctor) obj;
        if (speciality == null) {
            if (other.speciality != null)
                return false;
        } else if (!speciality.equals(other.speciality))
            return false;
        return true;
    }




}
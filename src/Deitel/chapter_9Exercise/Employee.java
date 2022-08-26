package Deitel.chapter_9Exercise;

public abstract class Employee {
    private String firstName;
    private String lastname;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastname, String socialSecurityNUmber) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNUmber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNUmber) {
        this.socialSecurityNumber = socialSecurityNUmber;
    }

    public abstract double earning();

    @Override
    public String toString() {
        return String.format("firstName: %s%n lastname: %s%n socialSecurityNUmber: %s", firstName, lastname, socialSecurityNumber);
    }
}



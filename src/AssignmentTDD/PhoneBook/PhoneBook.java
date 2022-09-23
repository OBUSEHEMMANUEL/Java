package AssignmentTDD.PhoneBook;


import java.util.ArrayList;

public class PhoneBook {
    static ArrayList<String> name = new ArrayList<>();

    static ArrayList<String>  address = new ArrayList<>();
    static ArrayList<String> phoneNumber = new ArrayList<>();

    static ArrayList<String> email = new ArrayList<>();


    public void name(String personName) {
        name.add(personName);
    }

    public String getName(int index) {
        return name.get(index);
    }

    public void address(String homeAddress) {
        address.add(homeAddress);

    }

    public String getAddress(int index) {
        return address.get(index);
    }

    public void phoneNumber(String number) {
        phoneNumber.add(number);
    }

    public String getPhoneNumber(int index) {
        return phoneNumber.get(index);
    }

    public void email(String mail) {
        email.add(mail);
    }

    public String getEmail(int index) {
        return email.get(index);
    }
}

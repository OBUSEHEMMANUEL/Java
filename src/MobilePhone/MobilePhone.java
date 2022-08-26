package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private Contact contact;
    private static ArrayList<Contact> contacts= new ArrayList<>();

    public MobilePhone(Contact contact) {
        this.contact = contact;
    }



    public void addContact(Contact phoneNumber,Contact name ){
        contacts.add(name);
        contacts.add(phoneNumber);


    }
    public void printContact(){
        System.out.print("Contact Size"+ contacts.size());
    }
    public void  modifyContact(Contact phoneNumber,Contact name ){
    }


}

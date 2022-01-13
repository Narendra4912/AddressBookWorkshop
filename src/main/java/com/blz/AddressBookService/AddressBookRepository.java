package com.blz.AddressBookService;

public class AddressBookRepository {


    public int addContactsData(String firstName, String lastname, String address, String city, String state, int zip, long phoneNo, String email) {

        Contact contact = new Contact();

        contact.setFirstName(firstName);
        contact.setLastname(lastname);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNo(phoneNo);
        contact.setEmail(email);

        return 1;
    }
}

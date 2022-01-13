package com.blz.AddressBookTest;

import com.blz.AddressBookService.AddressBookRepository;
import com.blz.AddressBookService.Contact;
import org.junit.Assert;
import org.junit.Test;

public class AddressBookTesting {

    @Test
    public void givenContactDetailsWhenAddedReturnTrue() {

        AddressBookRepository repository = new AddressBookRepository();

        String firstName= "Narendra";
        String lastname = "Pawar";
        String address = "Daul";
        String city = "Dondaicha";
        String state = "Maharashtra";
        int zip = 425408;
        long phoneNo = 9876543210l;
        String email = "narendra4912@gmail.com";


        int actual = repository.addContactsData(firstName, lastname, address, city, state, zip, phoneNo, email);
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }
}

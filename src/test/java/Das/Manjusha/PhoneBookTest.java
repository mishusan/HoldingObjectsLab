package Das.Manjusha;

import Das.Manjusha.Contacts;
import Das.Manjusha.PhoneBook;
import org.junit.Assert;
import org.junit.Test;


public class PhoneBookTest {



    @Test
    public void addContactTest(){
        PhoneBook phoneBook = new PhoneBook();

        String expectedContactName = "Manjusha";

        Contacts newContacts = new Contacts(expectedContactName);

        phoneBook.addContact(expectedContactName, newContacts);

        String actualContactName = phoneBook.lookupContact(expectedContactName).getName();

        Assert.assertTrue(expectedContactName.equals(actualContactName));
    }


    @Test
    public void testLookupContactOnEmptyPhoneBook(){

        PhoneBook emptyPhoneBook = new PhoneBook();

        Assert.assertNull(emptyPhoneBook.lookupContact("Nothing"));

    }

    @Test
    public void testLookupContact(){

        PhoneBook phoneBook = new PhoneBook();
        String ContactName = "Manjusha";
        phoneBook.addContact(ContactName, new Contacts(ContactName));
        Assert.assertNotNull(phoneBook.lookupContact(ContactName));


    }

}

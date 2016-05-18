package Das.Manjusha;

import static junit.framework.Assert.assertEquals;

import Das.Manjusha.Contacts;
import org.junit.Test;

public class ContactTest {


    @Test
    public void testAddPhoneNumber(){

        Contacts newContacts = new Contacts("Manjusha");

        newContacts.addPhoneNumber("302-256-8190");

        int actualNumberOfentries = newContacts.getNumberOfentries();
        int expectedNumberOfentries = 1;
        assertEquals(expectedNumberOfentries, actualNumberOfentries);


    }

    @Test
    public void testName(){

        assertEquals("Manjusha", new Contacts("Manjusha").getName());
    }

    @Test
    public void testRemovePhoneNumber(){
        Contacts newContacts = new Contacts("Manjusha");

        newContacts.addPhoneNumber("302-256-8190");
        newContacts.removePhoneNumber(1);

        int actualNumberOfentries = newContacts.getNumberOfentries();
        int expectedNumberOfEntries = 0;
        assertEquals(expectedNumberOfEntries, actualNumberOfentries);


    }
}

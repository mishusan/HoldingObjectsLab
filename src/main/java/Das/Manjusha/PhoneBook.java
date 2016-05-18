package Das.Manjusha;

import Das.Manjusha.Contacts;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, Contacts> contactsMap;

    public PhoneBook() {
        contactsMap = new HashMap<String, Contacts>();
    }

    public void addContact(String name, Contacts newContact) {
        contactsMap.put(name, newContact);
    }

    public Contacts lookupContact(String findContact) {
        return contactsMap.get(findContact);
    }

    public void removeContact(String oldContact) {
        contactsMap.remove(oldContact);
    }
}
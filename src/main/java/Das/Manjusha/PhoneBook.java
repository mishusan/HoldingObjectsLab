package Das.Manjusha;

import Das.Manjusha.Contacts;

import java.util.ArrayList;
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

    public ArrayList<Contacts> reverseLookUp(String phoneNumber) {
        ArrayList<Contacts> results= new ArrayList<>();
        for (Map.Entry<String, Contacts> entry : contactsMap.entrySet()) {
            for (String lookForNumber : lookupContact(entry.getKey()).getPhoneNumbers()){
                if (lookForNumber == phoneNumber) {
                    results.add(entry.getValue());
                }
            }
        }
        return results;
    }
    public void printPhoneBook(){
        for (Map.Entry<String, Contacts> entry:contactsMap.entrySet()){
            System.out.println(entry.getKey()+ " :"+ entry.getValue().getPhoneNumbers());
        }


    }

}
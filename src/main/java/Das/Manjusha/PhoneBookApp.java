package Das.Manjusha;

/**
 * Created by manjushadas on 5/16/16.
 */
public class PhoneBookApp {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contacts manjusha = new Contacts("Manjusha Das");
        phoneBook.addContact("Manjusha",manjusha);
        phoneBook.lookupContact("Manjusha");
    }
}

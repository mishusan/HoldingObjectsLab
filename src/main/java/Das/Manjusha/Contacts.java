package Das.Manjusha;

import java.util.ArrayList;
import java.util.List;


public class Contacts {

    List<String> phoneNumbers;


    private String name;

    public Contacts(String name){
        this.name = name;
        phoneNumbers = new ArrayList<String>();

    }

    public String getName() {
        return name;
    }

    public void addPhoneNumber(String newPhoneNumber){
        phoneNumbers.add(newPhoneNumber);

    }

    public int getNumberOfentries(){
        return phoneNumbers.size();
    }

    public void removePhoneNumber(int index){
        phoneNumbers.remove(index-1);

    }


}

package Das.Manjusha;

import java.util.*;


public class Contacts {

    ArrayList<String> phoneNumbers;
    private String name;
    Scanner scanner = new Scanner(System.in);

    public Contacts(String name){
        this.name = name;
        phoneNumbers = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public ArrayList<String> getPhoneNumbers(){
        return phoneNumbers;

    }
    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumber(String newNumber) {
        phoneNumbers.add(newNumber);
    }

    public void removePhoneNumber(String oldNumber){
        Iterator<String> iterator = phoneNumbers.iterator();
        while(iterator.hasNext()){
            String phoneNumber = iterator.next();

            if(phoneNumber.equals(oldNumber)) iterator.remove();
        }
    }
    public String showAllPhoneNumbers(){
        String allPhoneNumbers="";
        for (String phoneNumber:phoneNumbers
             ) {
            allPhoneNumbers+=phoneNumber+"\n";
        }
        return allPhoneNumbers;
    }
    public int getNumberOfphoneNumbers(){
        return phoneNumbers.size();
    }

}

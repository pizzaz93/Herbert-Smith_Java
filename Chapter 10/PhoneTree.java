import java.util.TreeMap;

public class PhoneTree {
    /**
    * A PhoneDirectory holds a list of names with a phone number for
    * each name. It is possible to find the number associated with
    * a given name, and to specify the phone number for a given name. Create it as a Tree Map
    */  
    TreeMap<String,String> Directory = new TreeMap<String,String>();
    /**
    * An object of type PhoneEntry holds one name/number pair.
    */ 
     private static class PhoneEntry {
        String name;        // The name.
        String number;      // The associated phone number.
     }
     public void addNewEntryPhoneDirectory(String name, String number) {
         PhoneEntry newEntry = new PhoneEntry ();    // Create a new pair.
         newEntry.name = name;
         newEntry.number = number;
         if (newEntry.name == null || newEntry.number == null) {
             throw new IllegalArgumentException ("name and number cannot be null");
         }
         Directory.put(newEntry.name, newEntry.number);   
    } 

    public String getNumber(String name) {
        String numberResult = Directory.get(name);
        if(numberResult != null && !numberResult.isEmpty())
        return numberResult;
        else {
            throw new IllegalArgumentException ("name does not exist");
        }
    }
          
    public String getName(String number) {
        String nameResult = Directory.get(number);
        if(nameResult != null && !nameResult.isEmpty())
        return nameResult;
        else {
            throw new IllegalArgumentException ("name does not exist");
        }
    }
}

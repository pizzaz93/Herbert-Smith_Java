
/*Write a hash table in which both the keys and the values
are of type String. Write an implementation of hash tables from scratch. Define the following
methods: get(key), put(key,value), remove(key), containsKey(key), and size().
You don’t have to define your own hash
function. Do not use any of Java’s built-in generic types; create your own linked lists
using nodes. However, you do not have to worry about
increasing the size of the table when it becomes too full.
You should also write a short program to test your solution.
 * */

public class HashingItOut {
    
    class Node {
        String item;
        Node next;
    }
    
    Node[] hashImplementation = new Node[99]; // make this manipuatlable if it fails like array list might not need it tho
    
    public static void main(String[] args) { // this method showcases the methods below
        
        HashingItOut hashBrown = new HashingItOut();
        
        hashBrown.put("1", "austin powers"); 
        hashBrown.put("2" , "michael phelps");
        
        String result = hashBrown.get("2");
        System.out.println("the value for that key is: " + result);
        int length = hashBrown.size("1");
        System.out.println("the size for that key is: " + length);
        hashBrown.remove("2");
        boolean determine = hashBrown.containsKey("2");
        System.out.println("that key is here: " + determine);
        
    }
                                               
  
     public  String get(String key) {                                                                       
         int keyHash = key.hashCode();
         Node runner;
         runner = hashImplementation[keyHash];
         String result = runner.item;
         
         while (!runner.item.contains(key) && runner.next != null) {
             runner = runner.next;
             result = runner.item;
             }
         int space = result.indexOf(" ");
         String value = result.substring(space);
         return value;
     }
     
     public  boolean containsKey(String key) {                                                                      
         int keyHash = key.hashCode();
         Node runner;
         runner = hashImplementation[keyHash];
         if (runner != null) {         
             while (!runner.item.contains(key) && runner.next != null) {
                 runner = runner.next;
                 if (runner.item.contains(key)) {
                     return true;
                 }
             }
             if (runner.item.contains(key)) {
                 return true;
             }
             else {
               return false;
             }
         }
         else {
             return false;
         }
     } 
    
     public  boolean put(String key, String value) {
         Node runner;
         Node newKid;
         Node previous = null;
         newKid = new Node();
         String itemValue = (key + " " + value);
         newKid.item = itemValue;
         int keyHash = key.hashCode();
         
         runner = hashImplementation[keyHash];
         
         if (runner == null) {
             hashImplementation[keyHash] = newKid;
             System.out.println("New key: " + key +" added");
             return true;
         }
         
         else {
             while (runner.next != null) {
                 previous = runner;
                 runner = runner.next;
             }
             previous.next = newKid;
             System.out.println("New key: " + key +" added");
             return true;
         }
         
     }
     
     public  boolean remove(String key) {
         int keyHash = key.hashCode();
         Node runner;
         Node previous = null;
         runner = hashImplementation[keyHash];
         String result = runner.item;
         
         if (result.contains(key)) {
             runner = runner.next;
             System.out.println("Key: " + key +" is deleted");
             return true;
         }
         
         else {
             while (!runner.item.contains(key) && runner.next != null) {
                 previous = runner;
                 runner = runner.next;
                 result = runner.item;
             }
             if (runner != null && runner.item.contains(key)) {
                 previous.next = runner.next;
                 System.out.println("Key: " + key +" is deleted");
                 return true;
             }
             else {
                 return false;
             }
           
        }
  
     }
     
     public  int size(String key) {
         int size = 0;
         int keyHash = key.hashCode();
         Node runner;
         runner = hashImplementation[keyHash];
         size++;
         
         while (runner.next != null) {
                 size++;
             }
         return size;
     }
}  

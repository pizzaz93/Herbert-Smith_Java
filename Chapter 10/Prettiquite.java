import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*The idea is that an object that implements this interface knows how to “test” objects
of type T in some way. Define a class that contains the following generic static methods
for working with predicate objects. The name of the class should be Predicates, in analogy
with the standard class Collections that provides various static methods for working with
collections.
 * */

public class Prettiquite {
    
    public interface Predicate<T> {
        
        
        public boolean test( T obj );
        
        }
       
        
    
    public static <T> void remove(Collection<T> coll, Predicate<T> pred) {
    // Remove every object, obj, from coll for which pred.test(obj) is true.
        for(Iterator<T> iterator = coll.iterator(); iterator.hasNext();) {
            T obj  = iterator.next();
            if(pred.test(obj)) {
                coll.remove(obj);
            }
        }
    }
       
        
        
    public static <T> void retain(Collection<T> coll, Predicate<T> pred) {
    // Remove every object, obj, from coll for which pred.test(obj) is false. (That is, retain the  objects for which the predicate is true.)
        for(Iterator<T> iterator = coll.iterator(); iterator.hasNext();) {
            T obj  = iterator.next();
            if(!pred.test(obj)) {
                coll.remove(obj);
            }
        }
    }
       
        
        
    public static <T> List<T> collect(Collection<T> coll, Predicate<T> pred){
    // Return a List that contains all the objects, obj, from the collection, coll, such that pred.test(obj) is true.
        List<T> collectionList = new ArrayList<T>();
        for(Iterator<T> iterator = coll.iterator(); iterator.hasNext();) {
            T obj  = iterator.next();
            if(pred.test(obj)) {
                collectionList.add(obj);
            }
        }
        
        return collectionList;
    
    }   
    
    public static <T> int find(ArrayList<T> list, Predicate<T> pred) {
    // Return the index of the first item in list for which the predicate is true, if any. If there is no such item, return -1.
            
        for(int i = 0; i < list.size(); i++) {
            T obj = list.get(i);
            
            if(pred.test(obj)){ 
                return i;
            }
            
        }
        return -1;
             
            
    }
       
        
}  

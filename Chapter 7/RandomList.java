import java.util.ArrayList;
/*
Write a subroutine that creates an ArrayList containing several different random integers
in the range from 1 up to some specified maximum. The number of integers and the
maximum allowed value for the integers should be parameters to the subroutine. Write a
main() routine to test your subroutine.
 * */
public class RandomList {
     
    public static void main(String[] args) {
     RandomList random = new RandomList();
     ArrayList<Integer> newList = new ArrayList<Integer>();
     newList = random.randomList(6,23);
     for (int i = 0; i < newList.size(); i++) {
         System.out.println(newList.get(i));
     }
     
     
    }
    
    public ArrayList<Integer> randomList(int nums, int max) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 0;
        for (int i = 0; i < nums; i++) {
        num = (int)(Math.random() * max + 1);
        list.add(num);
        }
        return list;
    }
    
}

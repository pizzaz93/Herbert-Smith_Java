
/*Write a subroutine that will make a copy of a list, with the order of the items of the list
reversed
 * */
public class NodeFlipped {
    public static void main(String[] args) {
        
        NodeFlipped node = new NodeFlipped();
       
        ListNode listicle = node.new ListNode();
        int listNode = 1;
        ListNode listy = node.new ListNode();
        listNode ++;
        ListNode listerine = node.new ListNode();
        listNode ++;
        ListNode listance = node.new ListNode();
        listNode ++;
        listicle.item = 5;
        listicle.next = listy;
        listy.item = 7;
        listy.next = listerine;
        listerine.item = 8;
        listerine.next =listance;
        listance.item = 23;
        ListNode flipped = node.flipping(listicle, listNode);
        ListNode runner = node.new ListNode();
        runner = flipped;
        while (listNode != 0) {
            System.out.println(runner.item);
            runner = runner.next;
            listNode = listNode -1;
        }
     }
    
    class ListNode {
         int item;
         ListNode next; 
    }

    public ListNode flipping(ListNode orig, int count) {
        ListNode runner = new ListNode();
        ListNode listed = new ListNode();
        ListNode listInt = new ListNode();
        ListNode chainEnd = new ListNode();
        ListNode flipped = new ListNode();
        int[] order = new int[count];
        runner = orig;
        
         for (int i = 0; i < order.length; i++){
            order[i] = runner.item;
            if (i != order.length) {
                runner = runner.next;
            }
        }  
        flipped.item = order[3]; 
        listInt.item = order[2];
        listed.item = order[1];
        chainEnd.item = order[0];
        flipped.next = listInt;
        listInt.next = listed;
        listed.next = chainEnd;
        chainEnd.next = null;
        return flipped;
    }
}   
    

import java.util.LinkedList;
import java.util.Queue;

/*A non-recursive subroutine can be used to
print the items in a binary tree, provided that a stack or queue is used as an auxiliary data structure.
Write a subroutine that implements this algorithm, and write a program to test the sub-
routine.
 * */
public class BinaryTreeQueuePrint {
    public static void main(String[] args) {
        BinaryTreeQueuePrint btqp = new BinaryTreeQueuePrint();
        TreeNode test = btqp.new TreeNode();
        TreeNode testy = btqp.new TreeNode();
        TreeNode testi = btqp.new TreeNode();
        TreeNode testier = btqp.new TreeNode();
        TreeNode testiest = btqp.new TreeNode();
        TreeNode testworthy = btqp.new TreeNode();
        TreeNode testfull = btqp.new TreeNode();
        test.item = 66;
        testy.item = 78;
        testi.item = 56;
        testier.item = 69;
        testiest.item = 32;
        testworthy.item = 54;
        testfull.item = 22;
        test.right = testy;
        test.left = testi;
        testy.right = testier;
        testy.left = testiest;
        testiest.right = testworthy;
        testiest.left = testfull;
        btqp.algorithim(test);
     }
    
    class TreeNode {
         int item;
         TreeNode left; 
         TreeNode right;
    }

    public void algorithim(TreeNode root) {
       Queue<TreeNode> queueOfTrees = new LinkedList<>();
       queueOfTrees.add(root);
       while (!queueOfTrees.isEmpty()) {
           TreeNode node = queueOfTrees.remove();   
           System.out.println(node.item);
           if (node.left != null) {
               queueOfTrees.add(node.left);
           }
           if (node.right != null) {
               queueOfTrees.add(node.right);
           }
       }
    }
}   
    

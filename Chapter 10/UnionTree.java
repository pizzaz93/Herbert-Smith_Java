/*For this exercise, you should write a program that can be used as a “set calcula-
tor” for simple operations on sets of non-negative integers. (Negative integers are not
allowed.) A set of such integers will be represented as a list of integers, separated by
commas and, optionally, spaces and enclosed in square brackets. For example: [1,2,3]
or [17, 42, 9, 53, 108]. The characters +, *, and - will be used for the union, in-
tersection, and difference operations. The user of the program will type in lines of input
containing two sets, separated by an operator. The program should perform the operation
and print the resulting set. Here are some examples:
Input                                      Output
-------------------------             -------------------
[1, 2, 3] + [3, 5, 7]                    [1, 2, 3, 5, 7]
[10,9,8,7] * [2,4,6,8]                   [8]
[ 5, 10, 15, 20 ] - [ 0, 10, 20 ]        [5, 15]
  */

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnionTree {
    
    public static void main(String[] args) {
    TreeSet<Integer> a = new TreeSet<Integer>(); 
    TreeSet<Integer> b = new TreeSet<Integer>(); 
    int evaluatorPosition = 0;
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter Two sets of number with the desired operator between them (for example 5,4,3 + 5,8,7) or 0 to exit:");
    
    String input = stdin.nextLine();// handle 0 and test difference and intersection 
    
    Pattern negative = Pattern.compile("-[0-9]+");
    Matcher matchNegative = negative.matcher(input);
    if (matchNegative.find()) {
        stdin.close();
        throw new IllegalArgumentException ("numbers cannot be negative");
    }
    while (!input.equals("0") && !input.equals(" 0")) {
        
        int firstSpace = input.indexOf(" ");
        String firstSet = input.substring(0, firstSpace);
        String[] firstSetArray = firstSet.split(",");
        
        int[] firstSetNumArray = new int[firstSetArray.length];
        for (int l = 0; l < firstSetArray.length; l++){
            firstSetNumArray[l] = Integer.parseInt(firstSetArray[l]);
        }
        
        boolean union = input.contains("+");
        boolean difference = input.contains("-");
        boolean intersection = input.contains("*");
        if (!union && !difference && !intersection) {
            stdin.close();
            throw new IllegalArgumentException ("cant make an operation without an operator");
        }
        if (union) {
            evaluatorPosition = input.indexOf("+");
        }
        else if (difference) {
            evaluatorPosition = input.indexOf("-");
        }
        else if (intersection) {
            evaluatorPosition = input.indexOf("*");
        }
        
        String secondSet = input.substring(evaluatorPosition);
        int secondSpace = secondSet.indexOf(" ");
        String evaluator = secondSet.substring(0, secondSpace);
        String secondSetNumbers = secondSet.substring(2);
        String[] secondSetArray = secondSetNumbers.split(",");
        int[] secondSetNumArray = new int[secondSetArray.length];
        for (int j = 0; j < secondSetArray.length; j++){
            secondSetNumArray[j] = Integer.parseInt(secondSetArray[j]);
        }
             
        for (int p: firstSetNumArray) { 
            a.add(p);
        }
        for (int k : secondSetNumArray) { 
            b.add(k);
        }
        
        switch (evaluator) {
        case "+":
            // Union
            a.addAll(b);
            break;
        case "-":
            //Difference
            a.removeAll(b);
            break;     
        case "*":
            //Intersection
            a.retainAll(b);
            break;
        }
        System.out.println(a);
        System.out.print("Enter Two sets of number with the desired operation in between them (for example 5,4,3 + 5,8,7) or 0 to exit:");
        a.clear();
        b.clear();
        input = stdin.nextLine();
    }
    stdin.close();
    System.out.println("Thank you for staying at the Union Tree Resort!");
    
   }   
}  

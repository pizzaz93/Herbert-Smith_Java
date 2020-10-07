
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
/*
Write a program that can create a concordance. A concordance lists every
word that occurs in the document, and for each word it gives the line number of every
line in the document where the word occurs. The document should be read from
an input file, and the concordance data should be written to an output file. 
 * */

public class ConcordanceUniversity {
 
    public static void main(String[] args) throws IOException{  
        TreeMap<String,TreeSet<Integer>> concordance = new TreeMap<String,TreeSet<Integer>>();
        System.out.println("Select an input file then press enter: ");
        Scanner input = new Scanner(System.in);
        File readFile = new File(input.nextLine());
        System.out.println("Select an output file then press enter: ");
        String outputFile = input.nextLine();
        input.close();
        Scanner reader = new Scanner(readFile);
        int lineNum = 1; 
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] wordz = line.split(" ");
            String word = "";
            for (String p: wordz) {
                word = p;
                if (!word.equals("the") && word.length() >= 3) {
                    TreeSet<Integer> references; 
                    references = concordance.get(word);
                    if (references == null){
                        TreeSet<Integer> firstRef = new TreeSet<Integer>();
                        firstRef.add(lineNum);
                        concordance.put(word,firstRef);
                    }
                    else {
                        references.add(lineNum); 
                    }
                }
            }
            lineNum ++;
        }
        reader.close();
    
    
     /**
    * Print each entry in the index.
    */
    
        PrintWriter ink = new PrintWriter(outputFile);
        for(Map.Entry<String,TreeSet<Integer>> entry : concordance.entrySet()) {
    
            String term = entry.getKey();
            TreeSet<Integer> pageSet = entry.getValue();
            ink.print( term + " " );
            for ( int page : pageSet ) {
                ink.print( page + " " );
            }
            ink.println();
        }
        ink.close();
        System.out.print("Success!");
        }
}  

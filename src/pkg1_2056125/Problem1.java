/**********************************************************************
 Assignment 1: Problem 1 
 Implement a recursive method that generates all possible distinct subsets 
 of the characters from a string.
 Author’s Panther ID: 2056125
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 *********************************************************************/ 
package pkg1_2056125;

/**
 *
 * @author ACE
 */
public class Problem1 {

    public String recursive (String word, int wordLength, String subStrings) 
    {
           
           if (wordLength==0)
           {
               return subStrings;
           }
           else
           {
               subStrings = subStrings + word + "/n";
               recursive(word, wordLength-1, subStrings);
           }
        return subStrings;        
    }
    
    public static void main(String[] args) {
        int wordLength;
        String word = "abba";
        wordLength = word.length();
        String subStrings = "";
       
                
    }
    
}

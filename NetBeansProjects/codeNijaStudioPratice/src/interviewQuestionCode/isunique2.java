/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewQuestionCode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Abiodun Olakunle
 */
public class isunique2 {
    
    public boolean isUnique(int num) {
    // Convert the number to a string
    String numString = Integer.toString(num);
    // Create a set to store the digits
    Set<Character> digits = new HashSet<>();
    // Iterate through the string
    for (char c : numString.toCharArray()) {
        // If the digit is already in the set, return false
        if (digits.contains(c)) {
            return false;
        }
        // Otherwise, add the digit to the set
        digits.add(c);
    }
    // If all the digits are unique, return true
    return true;
}

    public static void main (String[] args){
    
   // System.out.println(isUnique(1234));
    
    }
    
}

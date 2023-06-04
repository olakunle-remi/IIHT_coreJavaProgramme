/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewcode;

/**
 *
 * @author Abiodun Olakunle
 */
public class usignRigthshift {
    public static void main(String args[]){
        int a = 240;
        
        // Binary representation of 240 is 11110000
        // unsigned right shifte mens remove
        // number of bit to the right and 
        // append into the left 00 111100 = 60
        System.out.println("a >>> 2 = " + (a >>>2));
    }
    
}

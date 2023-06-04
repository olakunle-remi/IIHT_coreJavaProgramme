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
public class leftshiftOperator {
    public static void main(String arg[]){
        int a  = 8;
        
        // binary respresentation of 8 is 1000
        // left shift means append number of 
        // 0's to the right. 10000 = 32
        
        System.out.println("a <<2 " + (a << 2));
    }
}

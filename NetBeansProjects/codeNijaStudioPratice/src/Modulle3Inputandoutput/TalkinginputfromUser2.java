/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulle3Inputandoutput;

import java.util.Scanner;

/**
 *
 * @author Abiodun Olakunle
 */
public class TalkinginputfromUser2 {
    public static void main(String args[]){
        //creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        // read initial value from the user
        System.out.println("Enter any string ");
        String str = sc.nextLine();
        
       
        
        System.out.println("the string you enter" + str);
    }
    
}

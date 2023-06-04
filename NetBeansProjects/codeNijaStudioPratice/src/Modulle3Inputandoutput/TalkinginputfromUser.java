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
public class TalkinginputfromUser {
    public static void main(String args[]){
        //creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        // read initer value from the user
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter Second nuber: ");
        int b = sc.nextInt();
        //Adding two values
        int  c = a + b;
        
        //print the sum
        System.out.println("sum is " + c);
    }
    
}

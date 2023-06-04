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
public class inputString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name  : ");
        
        // read a string from the user 
        String str1 = sc.nextLine();
        System.out.println("please enter your  address : ");
         String str2 = sc.nextLine();
         
         System.out.println("please enter your  Email : ");
         String str3 = sc.nextLine();
        
        System.out.println("Name: " + str1 + "\n" + "Address: " +str2 + "\n" +"Email: " + str3);
    }
}

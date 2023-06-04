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
public class execise {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     
    System.out.println("enter your name ");
    String str1 = sc.nextLine();
    
    
    System.out.println("enter your age ");
    int age = sc.nextInt();
    
    
    System.out.println("your name is : " + "\n" + str1 + " \n" +"your age is " + age );
}    
}
